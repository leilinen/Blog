package com.java.althgriom.hot100;


import com.java.althgriom.hot100.entity.ListNode;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-07
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans = null;
        ListNode p = ans;

        int t = 0;

        while (l1 != null && l2 != null){
            int sum = l1.val + l2.val + t;
            t = 0;
            if (sum >= 10) {
                t = sum / 10;
                sum = sum % 10;
            }
            ListNode l = new ListNode(sum);
            if (p == null) {
                p = l;
                ans = p;
            } else {
                p.next = l;
                p = l;
            }
            l1 = l1.next;
            l2 = l2.next;

        }

        while (l1 != null) {
            int sum = l1.val + t;
            t = 0;
            if (sum >= 10) {
                t = sum / 10;
                sum = sum % 10;
            }
            ListNode l = new ListNode(sum);
            if (p == null) {
                p = l;
            } else {
                p.next = l;
                p = l;
            }
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val + t;
            t = 0;
            if (sum >= 10) {
                t = sum / 10;
                sum = sum % 10;
            }
            ListNode l = new ListNode(sum);
            if (p == null) {
                p = l;
            } else {
                p.next = l;
                p = l;
            }
            l2 = l2.next;
        }

        if (t > 0) {
            ListNode l = new ListNode(t);
            p.next = l;
            p = l;
        }

        return ans;

    }



}
