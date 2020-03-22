package com.java.althgriom.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class mergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {

        ListNode l1 = new ListNode(1);
        ListNode e2 = new ListNode(2);
        ListNode e3 = new ListNode(4);
        ListNode e4 = new ListNode(6);
        l1.next = e2;
        e2.next = e3;
        e3.next = e4;

        ListNode l2 = new ListNode(1);
        ListNode f2 = new ListNode(2);
        ListNode f3 = new ListNode(4);
        l2.next = f2;
        f2.next = f3;

        ListNode l3 = MergeTwoSortedLists.mergeTwoLists(l1, l2);
        while (l3.next != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }


    }
}