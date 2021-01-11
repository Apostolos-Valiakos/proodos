package org.example;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class NetworkTest {
    @Mock
    MyClass mockedPerformer = Mockito.mock(Network.class);
    MyClass clazz = new MyClass(mockedPerformer);


    @Test
    public void TestThatTheMessageRecieves(){
        boolean res = clazz.SendMessage();
        Assert.assertTrue(res);
    }

}