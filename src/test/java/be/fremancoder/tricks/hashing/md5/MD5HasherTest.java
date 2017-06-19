package be.fremancoder.tricks.hashing.md5;

import be.fremancoder.tricks.hashing.tool.Salter;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Created by Freddy on 19-6-2017.
 */
public class MD5HasherTest extends TestCase {

    @Test
    public void testHashSuccess(){
        String md5Hash1 = MD5Hasher.hash("test");
        String md5Hash2 = MD5Hasher.hash("test");

        Assert.assertEquals(md5Hash1, md5Hash2);
    }

    @Test
    public void testHashFail(){
        String md5Hash1 = MD5Hasher.hash("test1");
        String md5Hash2 = MD5Hasher.hash("test2");

        Assert.assertNotEquals(md5Hash1, md5Hash2);
    }

    @Test
    public void testSaltedHashSuccess(){
        byte[] salt = Salter.getSalt();
        String md5Hash1 = MD5Hasher.saltedHash("test", salt);
        String md5Hash2 = MD5Hasher.saltedHash("test", salt);

        Assert.assertEquals(md5Hash1, md5Hash2);
    }

    @Test
    public void testSaltedHasherFail(){
        byte[] salt = Salter.getSalt();
        String md5Hash1 = MD5Hasher.saltedHash("test1", salt);
        String md5Hash2 = MD5Hasher.saltedHash("test2", salt);

        Assert.assertNotEquals(md5Hash1, md5Hash2);
    }

}