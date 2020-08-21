package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-21
 */
public class CheckCycleListTest {

    @Test
    public void hasCycleTest() {

        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(0);
        ListNode a4 = new ListNode(-4);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        Assert.assertFalse(CheckCycleList.hasCycle(a1));

        a4.next = a2;
        Assert.assertTrue(CheckCycleList.hasCycle(a1));
    }
}