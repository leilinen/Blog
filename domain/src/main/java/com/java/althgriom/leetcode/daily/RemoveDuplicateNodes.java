package com.java.althgriom.leetcode.daily;

import java.util.ArrayList;
import java.util.List;

/***
 * 移除未排序链表中的重复节点。保留最开始出现的节点。
 */

public class RemoveDuplicateNodes {

    public static ListNode removeDuplicateNodes(ListNode head) {

        if (head ==  null) {
            return head;
        }

        ListNode p = head.next;
        ListNode q = head;
        List<Integer> list = new ArrayList<>();
        list.add(head.val);

        while (p != null) {
            int val = p.val;
            if (list.contains(val)) {
                // remove
                q.next = p.next;
                p = p.next;
            } else {
                list.add(val);
                p = p.next;
                q = q.next;
            }
        }
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}