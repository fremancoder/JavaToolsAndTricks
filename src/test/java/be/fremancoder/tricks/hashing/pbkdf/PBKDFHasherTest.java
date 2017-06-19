package be.fremancoder.tricks.hashing.pbkdf;

import be.fremancoder.tricks.hashing.sha.SHAHasher;
import be.fremancoder.tricks.hashing.tool.Salter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Freddy on 19-6-2017.
 */
public class PBKDFHasherTest {

    @Test
    public void testSaltedHashPBKDFSuccess(){
        byte[] salt = Salter.getSalt();
        String pbkdfHash1 = PBKDFHasher.saltedHash("test", salt);
        String pbkdfHash2 = PBKDFHasher.saltedHash("test", salt);

        Assert.assertEquals(pbkdfHash1, pbkdfHash2);
    }

    @Test
    public void testSaltedHashPBKDFFail(){
        byte[] salt = Salter.getSalt();
        String pbkdfHash1 = PBKDFHasher.saltedHash("test1", salt);
        String pbkdfHash2 = PBKDFHasher.saltedHash("test2", salt);

        Assert.assertNotEquals(pbkdfHash1, pbkdfHash2);
    }

    @Test
    public void testValidatePwdPBKDFSuccess(){
        byte[] salt = Salter.getSalt();
        String pbkdfHash1 = PBKDFHasher.saltedHash("test", salt);
        boolean valid = PBKDFHasher.validatePassword("test", pbkdfHash1);

        Assert.assertTrue(valid);
    }

}