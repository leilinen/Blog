package com.java.althgriom.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-29
 */
public class ReverseListTest {

    @Test
    public void reverseListTest() {

        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode nodes = ReverseList.reverseList(node0);

        while(nodes != null) {
            System.out.print(nodes.val + " ");
            nodes = nodes.next;
        }
    }
}