package com.java.althgriom.offer;

/**
 * @Description:
 *
 * @Author: leiline
 * @CreateTime: 2020-08-21
 */
public class CheckCycleList {

    public static boolean hasCycle(ListNode head) {
        boolean hasCycle = false;

        ListNode p = head;
        ListNode q = head.next;

        while (p != null) {
            if (p == q) {
                hasCycle = true;
                break;
            }

            if (q.next == null) {
                break;
            }

            p = p.next;
            q = q.next.next;
        }

        return hasCycle;
    }
}
