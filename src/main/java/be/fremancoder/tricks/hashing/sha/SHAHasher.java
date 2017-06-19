package be.fremancoder.tricks.hashing.sha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Freddy on 19-6-2017.
 */
public class SHAHasher {

    public static String saltedHash(String stringToHash, byte[] salt, String hashType)
    {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance(hashType);
            md.update(salt);
            byte[] bytes = md.digest(stringToHash.getBytes());
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return generatedPassword;
    }

}
