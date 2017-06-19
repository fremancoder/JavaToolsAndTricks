package be.fremancoder.tricks.hashing.sha;

import be.fremancoder.tricks.hashing.md5.MD5Hasher;
import be.fremancoder.tricks.hashing.tool.Salter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Freddy on 19-6-2017.
 */
public class SHAHasherTest {

    @Test
    public void testSaltedHashSha1Success(){
        byte[] salt = Salter.getSalt();
        String shaHash1 = SHAHasher.saltedHash("test", salt, "SHA-1");
        String shaHash2 = SHAHasher.saltedHash("test", salt, "SHA-1");

        Assert.assertEquals(shaHash1, shaHash2);
    }

    @Test
    public void testSaltedHashSha1Fail(){
        byte[] salt = Salter.getSalt();
        String shaHash1 = SHAHasher.saltedHash("test1", salt, "SHA-1");
        String shaHash2 = SHAHasher.saltedHash("test2", salt, "SHA-1");

        Assert.assertNotEquals(shaHash1, shaHash2);
    }

    @Test
    public void testSaltedHashSha256Success(){
        byte[] salt = Salter.getSalt();
        String shaHash1 = SHAHasher.saltedHash("test", salt, "SHA-256");
        String shaHash2 = SHAHasher.saltedHash("test", salt, "SHA-256");

        Assert.assertEquals(shaHash1, shaHash2);
    }

    @Test
    public void testSaltedHashSha256Fail(){
        byte[] salt = Salter.getSalt();
        String shaHash1 = SHAHasher.saltedHash("test1", salt, "SHA-256");
        String shaHash2 = SHAHasher.saltedHash("test2", salt, "SHA-256");

        Assert.assertNotEquals(shaHash1, shaHash2);
    }

    @Test
    public void testSaltedHashSha512Success(){
        byte[] salt = Salter.getSalt();
        String shaHash1 = SHAHasher.saltedHash("test", salt, "SHA-512");
        String shaHash2 = SHAHasher.saltedHash("test", salt, "SHA-512");

        Assert.assertEquals(shaHash1, shaHash2);
    }

    @Test
    public void testSaltedHashSha512Fail(){
        byte[] salt = Salter.getSalt();
        String shaHash1 = SHAHasher.saltedHash("test1", salt, "SHA-512");
        String shaHash2 = SHAHasher.saltedHash("test2", salt, "SHA-512");

        Assert.assertNotEquals(shaHash1, shaHash2);
    }

    @Test
    public void testSaltedHashSha384Success(){
        byte[] salt = Salter.getSalt();
        String shaHash1 = SHAHasher.saltedHash("test", salt, "SHA-384");
        String shaHash2 = SHAHasher.saltedHash("test", salt, "SHA-384");

        Assert.assertEquals(shaHash1, shaHash2);
    }

    @Test
    public void testSaltedHashSha384Fail(){
        byte[] salt = Salter.getSalt();
        String shaHash1 = SHAHasher.saltedHash("test1", salt, "SHA-384");
        String shaHash2 = SHAHasher.saltedHash("test2", salt, "SHA-384");

        Assert.assertNotEquals(shaHash1, shaHash2);
    }


}