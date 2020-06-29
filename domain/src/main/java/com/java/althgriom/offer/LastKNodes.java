package com.java.althgriom.offer;

/**
 * @Description:  输入一个链表，输出该链表中倒数第k个节点。
 * @Author: leiline
 * @CreateTime: 2020-06-28
 */
public class LastKNodes {


    public static ListNode getKthFromEnd(ListNode head, int k) {

        ListNode pre = head;
        ListNode tail = head;

        for (int i=1; i<k; i++) {
            tail = tail.next;
        }

        while (tail.next != null) {
            pre = pre.next;
            tail = tail.next;
        }

        return pre;

    }
}
