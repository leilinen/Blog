package com.java.althgriom2022.hot100;

import com.java.althgriom.hot100.entity.ListNode;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-07-04
 */
public class MergeTwoList {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;

        ListNode node = new ListNode(-1);
        ListNode result = node;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
                node = node.next;
            } else {
                node.next = l2;
                l2 = l2.next;
                node = node.next;
            }
        }

        if (l1 != null) {
            node.next = l1;
        }

        if (l2 != null) {
            node.next = l2;
        }

        return result.next;
    }


    public static void main(String[] args) {
        ListNode node10 = new ListNode(1);
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        node10.next = node11;
        node11.next = node12;

        ListNode node20 = new ListNode(1);
        ListNode node21 = new ListNode(3);
        ListNode node22 = new ListNode(4);
        node20.next = node21;
        node21.next = node22;

        ListNode result = mergeTwoLists(node10, node20);
        System.out.println(result);
    }

}
