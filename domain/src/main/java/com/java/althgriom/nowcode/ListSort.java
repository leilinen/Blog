package com.java.althgriom.nowcode;

/***
 * Sort a linked list in O(n log n) time using constant space complexity.
 */
public class ListSort {

//    public ListNode sortList(ListNode head) {
//
//        if (head.next == null) {
//            return head;
//        }
//
//
//
//    }

    public void change(ListNode first, ListNode second) {
        ListNode temp = first;
        first.next = second.next;
        second.next = temp.next;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListSort sort = new ListSort();
        // ListNode sorted = sort.sortList(node1);
//
//        while (sorted.next != null) {
//            System.out.println(sorted.val + " ");
//        }

    }
}

