package com.granicus.soap;

import com.sun.org.apache.xml.internal.security.signature.XMLSignatureException;
import org.apache.axis.AxisFault;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Instant;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.util.Base64;


public class AESPlatformClient extends PlatformClientStub {

    private static final int RETRY_INTERVAL = 2000; // milliseconds
    private static final int MAX_RETRIES = 3;
    private static final int MESSAGE_COMPLEXITY = 128; // bytes
    private static final int KEYMAXSIZE = 32; // bytes
    private static final String MESSAGE_ALGORITHM = "AES";
    private static final String MESSAGE_ALGORITHM_MODE = "AES/CBC/PKCS5Padding";
    private static final String AUTHHASH_ALGORITHM = "HmacSHA512";

    public AESPlatformClient(String site) throws AxisFault, MalformedURLException {
       super(site);
    }

    public AESPlatformClient(String site, String preSharedKey, String keyType) throws RemoteException, MalformedURLException, InvalidAlgorithmParameterException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InterruptedException, IllegalBlockSizeException, BadPaddingException, XMLSignatureException {
        this(site);
        this.login(preSharedKey, keyType, 0);
    }

    /**
     *
     * @param preSharedKey A unique secret key known only to the user
     * @param keyType  The key type specified when the secret key was created in Media Manager
     * @param retryNumber  The current number of the recursive retry - begins at 0 and stops at 3; necessary to work around
     *                 edge cases with the time-sensitive window of the one-time-use key
     * @throws RemoteException
     */
    private void login(String preSharedKey, String keyType, int retryNumber) throws
            InterruptedException, NoSuchPaddingException,
            NoSuchAlgorithmException, InvalidAlgorithmParameterException,
            InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        // Generate the 'encryptedMessage' argument
        // First generate a timed, one-time use key from pre-shared key and convert to byte array
        int currentEpochTime = (int) Instant.now().getEpochSecond() >> 8; // shifted to create ~4 minute window
        String timedKey = preSharedKey + currentEpochTime;
        if (timedKey.length() < KEYMAXSIZE) { throw new InvalidKeyException(); }
        String timedKey32String = timedKey.substring(timedKey.length() - KEYMAXSIZE);
        byte[] timedKey32Bytes = timedKey32String.getBytes();
        SecretKeySpec timedKeyAES = new SecretKeySpec(timedKey32Bytes, MESSAGE_ALGORITHM);
        // generate a message from the keyType
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomMessageBytes = secureRandom.generateSeed(MESSAGE_COMPLEXITY);
        String randomMessageString = Arrays.toString(randomMessageBytes);
        String plainMessage = keyType + randomMessageString;
        // generate the initialization vector
        byte[] initVectorBytes = new byte[16];
        secureRandom.nextBytes(initVectorBytes);
        IvParameterSpec initVectorAES = new IvParameterSpec(initVectorBytes);
        // encrypt the message
        Cipher cipher = Cipher.getInstance(MESSAGE_ALGORITHM_MODE);
        cipher.init(Cipher.ENCRYPT_MODE, timedKeyAES, initVectorAES);
        byte[] cipherMessageBytes = cipher.doFinal(plainMessage.getBytes());

        // Generate the 'authHash' argument
        Mac sha512Hmac = Mac.getInstance(AUTHHASH_ALGORITHM);
        SecretKeySpec timedKeyHMAC = new SecretKeySpec(timedKey.getBytes(), AUTHHASH_ALGORITHM);
        sha512Hmac.init(timedKeyHMAC);
        byte[] hmacMessageBytes = sha512Hmac.doFinal(plainMessage.getBytes());

        // base 64 encode all arguments
        Base64.Encoder encoder = Base64.getEncoder();
        String encryptedMessage = encoder.encodeToString(cipherMessageBytes);
        String authHash = encoder.encodeToString(hmacMessageBytes);
        String initVector = encoder.encodeToString(initVectorAES.getIV());

        try {
            super.authenticateApp(encryptedMessage, authHash, initVector, keyType);
            String cookie = getCookiesFromResponse();
            setCookie(cookie);
        } catch(Exception e) { //retries are necessary because of edge cases with the time-sensitive key
            if(retryNumber < MAX_RETRIES) {
                Thread.sleep(RETRY_INTERVAL * ++retryNumber); //interval of 2 gives retries at 2,4,6 seconds
                login(preSharedKey, keyType, retryNumber);
            }
        }
    }
}
