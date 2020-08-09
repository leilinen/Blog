package com.java.althgriom.hot100;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-07
 */
public class LonestPalindromicSubstringTest {

    @Test
    public void longestPalindrome() {

        Assert.assertEquals(LonestPalindromicSubstring.longestPalindrome("babad"), "bab");

        Assert.assertEquals(LonestPalindromicSubstring.longestPalindrome("cbbd"), "bb");

    }

    @Test
    public void isPalindromeTest() {

        List<Character> list1 = new ArrayList<>();
        list1.add('a');
        list1.add('b');
        list1.add('c');
        list1.add('b');
        list1.add('a');
        Assert.assertEquals(LonestPalindromicSubstring.isPalindrome(list1), true);

        list1.add('d');
        Assert.assertEquals(LonestPalindromicSubstring.isPalindrome(list1), false);


        List<Character> list2 = new ArrayList<>();
        list2.add('a');
        list2.add('b');
        list2.add('b');
        list2.add('a');
        Assert.assertEquals(LonestPalindromicSubstring.isPalindrome(list2), true);


    }
}