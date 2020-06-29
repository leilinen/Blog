package com.java.althgriom.offer;

/**
 * @Description: 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * @Author: leiline
 * @CreateTime: 2020-06-28
 */
public class DeleteNode {

    public static ListNode deleteNode(ListNode head, int val) {

        ListNode pre = head;
        ListNode tail = head;
        if (tail.val == val) {
            return tail.next;
        } else {
            tail = tail.next;
        }

        while (tail != null && tail.val != val) {
            pre = tail;
            tail = pre.next;
        }

        if (tail != null) {
            pre.next = tail.next;
        }

        return head;
    }
}
