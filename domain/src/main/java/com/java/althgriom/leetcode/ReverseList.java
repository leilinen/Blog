package com.java.althgriom.leetcode;

/**
 * @Description: 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * @Author: leiline
 * @CreateTime: 2020-06-29
 */
public class ReverseList {

    public static ListNode reverseList(ListNode head) {

        if (head == null) return head;

        ListNode cur = head;
        ListNode pre = head.next;
        cur.next = null;
        while (pre != null) {
            ListNode t = pre.next;
            pre.next = cur;
            cur = pre;
            pre = t;
        }

        return cur;
    }
}
