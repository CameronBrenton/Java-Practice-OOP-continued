package com.keyin.demo;

import org.junit.Assert;
import org.junit.Test;

public class KeyinUnitTestDemoTest {

    @Test
    public void testResultIsTrue(){
        ClassUnderTest classUnderTest = new ClassUnderTest();
        boolean returnValue = classUnderTest.isTrue();

        Assert.assertTrue(returnValue);
    }
}
