package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InterImplementTest {
    InterImplement interImplement;
    @Before
    public  void setUp(){
        this.interImplement = new InterImplement();
    }

    @Test
    public void FirstTryOfSending(){
        Assert.assertFalse(interImplement.sendMessage("ip","mess"));
    }

    @Test
    public void SecTryOfSending(){
        interImplement.sendMessage("ip","mess");
        Assert.assertTrue(interImplement.sendMessage("ip","mess"));
    }
}