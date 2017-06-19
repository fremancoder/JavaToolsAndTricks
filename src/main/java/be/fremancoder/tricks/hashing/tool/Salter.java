package be.fremancoder.tricks.hashing.tool;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Created by Freddy on 19-6-2017.
 */
public class Salter {

    public static byte[] getSalt()
    {
        try {
            SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
            byte[] salt = new byte[16];
            sr.nextBytes(salt);
            return salt;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

}
