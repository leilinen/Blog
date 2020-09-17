package com.java.althgriom.hot100;

import com.java.althgriom.hot100.entity.ListNode;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-09-01
 */
public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (n==1) {
            head = head.next;
            return head;
        }

        ListNode p = head, q = head.next;

        for (int i=0; i<n; i++) {
            q = q.next;
        }

        while (q != null) {
            p = p.next;
            q = q.next;
        }

        p.next = p.next.next;


        return head;

    }
}
