package com.java.althgriom.offer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-28
 */
public class DeleteNodeTest {

    @Test
    public void deleteNodeTest() {

        ListNode node0 = new ListNode(4);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(9);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        ListNode nodes = DeleteNode.deleteNode(node0, 5);
        while (nodes != null) {
            System.out.print(nodes.val + " ");
            nodes = nodes.next;
        }

    }
}