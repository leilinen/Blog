package com.java.althgriom2021;

import com.java.althgriom.hot100.entity.ListNode;

/**
 * @Description: 两个链表数字合并
 * @Author: leiline
 * @CreateTime: 2021-10-29
 */
public class ListNodeSum {

    public static ListNode sum(ListNode l1, ListNode l2) {

        ListNode p = new ListNode(0);
        ListNode r = p;

        int f = 0;
        int e = 0;

        while (l1 != null && l2 !=null) {
            e = f + l1.val + l2.val;
            f = e / 10;
            e = e % 10;

            ListNode l = new ListNode(e);
            p.next = l;
            p = l;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            e = f + l1.val;
            f = e / 10;
            e = e % 10;

            ListNode l = new ListNode(e);
            p.next = l;
            p = l;

            l1 = l1.next;
        }

        while (l2 != null) {
            e = f + l2.val;
            f = e / 10;
            e = e % 10;

            ListNode l = new ListNode(e);
            p.next = l;
            p = l;

            l2 = l2.next;
        }

        if (f != 0) {
            ListNode l = new ListNode(f);
            p.next = l;
        }

        return r.next;


    }

    public static void main(String[] args) {
        ListNode l10 = new ListNode(2);
        ListNode l11 = new ListNode(3);
        ListNode l12 = new ListNode(5);

        l10.next = l11;
        l11.next = l12;

        ListNode l20 = new ListNode(2);
        ListNode l21 = new ListNode(7);
        ListNode l22 = new ListNode(4);

        l20.next = l21;
        l21.next = l22;

        ListNode r = sum(l10, l20);
        while (r != null) {
            System.out.println(r.val);
            r = r.next;
        }
    }
}
