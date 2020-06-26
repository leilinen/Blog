package com.java.althgriom.leetcode.daily;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateNodesTest {

    @Test
    public void removeDuplicateNodesTest() {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode res = RemoveDuplicateNodes.removeDuplicateNodes(node0);

        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }
}