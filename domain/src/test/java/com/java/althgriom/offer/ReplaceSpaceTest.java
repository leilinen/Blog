package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceSpaceTest {

    @Test
    public void replaceSpaceTest() {
        String s = "We are happy.";
        String replaced = ReplaceSpace.replaceSpace(s);
        Assert.assertEquals(replaced, "We%20are%20happy.");

        String s1 = " ";
        replaced = ReplaceSpace.replaceSpace(s1);
        Assert.assertEquals(replaced, "%20");

    }
}