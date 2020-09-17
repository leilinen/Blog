package com.java.althgriom.hot100;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-09-02
 */
public class GroupAnagramsTest {

    @Test
    public void groupAnagramsTest() {

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = GroupAnagrams.groupAnagrams(input);
        Assert.assertEquals(ans.size(), 3);
    }
}