package com.java.althgriom.hot100;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-07
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstringTest() {

        String test = "abcabcbb";
        Assert.assertEquals(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(test), 3);
    }

    @Test
    public void lengthOfLongestSubstringTest2() {

        String test = "bbbb";
        Assert.assertEquals(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(test), 1);
    }

    @Test
    public void lengthOfLongestSubstringTest3() {

        String test = "pwwkew";
        Assert.assertEquals(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(test), 3);
    }

    @Test
    public void lengthOfLongestSubstringTest4() {

        String test = "dvdf";
        Assert.assertEquals(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(test), 3);
    }

    @Test
    public void lengthOfLongestSubstringTest5() {

        String test = " ";
        Assert.assertEquals(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(test), 1);
    }
}