package com.java.althgriom.offer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-28
 */
public class LastKNodesTest {

    @Test
    public void getKthFromEndTest() {

        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode nodes = LastKNodes.getKthFromEnd(node0, 3);

        while (nodes != null) {
            System.out.print(nodes.val + " ");
            nodes = nodes.next;

        }
    }
}