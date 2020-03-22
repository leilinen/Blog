package com.java.althgriom.leetcode;

/***
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1.next == null) {
            return  l2;
        }

        if (l2.next == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists( l2.next, l1);
            return l2;
        }


    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}