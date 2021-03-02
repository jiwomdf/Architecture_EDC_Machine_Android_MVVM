package com.katilijiwo.edcmachineandroidprintpractice.util;

import android.util.Log;

import org.bouncycastle.util.encoders.Base64;

import java.nio.charset.StandardCharsets;
import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;


public class ENC {

    public static String encrypt(String strToEncrypt) {
        String skey = Util.APP_KEY;
        String salt = Util.APP_SALT;

        if(strToEncrypt != null) {
            if (strToEncrypt.length() > 0)
                try {
                    byte[] iv = {0, 1, 2, 3, 5, 7, 3, 0, 1, 4, 6, 3, 4, 9, 5, 3};
                    IvParameterSpec ivspec = new IvParameterSpec(iv);

                    SecretKeyFactory factory = SecretKeyFactory.getInstance(Util.APP_KEY_FAC);
                    KeySpec spec = new PBEKeySpec(skey.toCharArray(), salt.getBytes(), Util.APP_ITR, Util.APP_LENGTH);
                    SecretKey tmp = factory.generateSecret(spec);
                    SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), Util.APP_ENC);

                    Cipher cipher = Cipher.getInstance(Util.APP_KEY_MODE);
                    cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);
                    byte[] encode = Base64.encode(cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8)));
                    return new String(encode);
                } catch (Exception e) {
                    Log.e("AES", "Error while encrypting: " + e.toString());
                }
            return "";
        }
        return null;
    }

    public static String decrypt(String strToDecrypt) {
        String skey = Util.APP_KEY;
        String salt = Util.APP_SALT;
        if(strToDecrypt != null) {
            if(strToDecrypt.length() > 0)
                try {
                    byte[] iv = {0, 1, 2, 3, 5, 7, 3, 0, 1, 4, 6, 3, 4, 9, 5, 3};
                    IvParameterSpec ivspec = new IvParameterSpec(iv);

                    SecretKeyFactory factory = SecretKeyFactory.getInstance(Util.APP_KEY_FAC);
                    KeySpec spec = new PBEKeySpec(skey.toCharArray(), salt.getBytes(), Util.APP_ITR, Util.APP_LENGTH);
                    SecretKey tmp = factory.generateSecret(spec);
                    SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), Util.APP_ENC);

                    Cipher cipher = Cipher.getInstance(Util.APP_KEY_MODE);
                    cipher.init(Cipher.DECRYPT_MODE, secretKey, ivspec);
                    byte[] cipherData = cipher.doFinal(Base64.decode(strToDecrypt.getBytes(StandardCharsets.UTF_8)));
                    return new String(cipherData, "UTF-8");
                } catch (Exception e) {
                    Log.e("AES", "Error while decrypting: " + e.toString());
                }
            return "";
        }
        return null;
    }
}
