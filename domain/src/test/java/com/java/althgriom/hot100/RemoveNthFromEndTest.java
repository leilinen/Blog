package com.java.althgriom.hot100;

import com.java.althgriom.hot100.entity.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-09-01
 */
public class RemoveNthFromEndTest {

    @Test
    public void removeNthFromEndTest() {

        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode res = RemoveNthFromEnd.removeNthFromEnd(head, 3);

        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }

    @Test
    public void removeNthFromEndTest2() {

        ListNode head = new ListNode(1);


        ListNode res = RemoveNthFromEnd.removeNthFromEnd(head, 1);

        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}