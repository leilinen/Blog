package com.java.althgriom.offer;

import java.util.List;
import java.util.Stack;

/***
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class ListNodeReversePrint {

    public static int[] reversePrint(ListNode head) {

        Stack<Integer> stack = new Stack<>();

        ListNode p = head;
        while (p != null) {
            stack.push(p.val);
            p = p.next;
        }
        int stackSize = stack.size();
        int[] prints = new int[stackSize];
        for (int i=0; i<stackSize; i++) {
            prints[i] = stack.pop();
        }
        return prints;
    }


    public static void main(String[] args) {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        node0.next = node1;
        node1.next = node2;

        int[] res = reversePrint(node0);
        for (int i=0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}


