package com.java.althgriom2022;

import com.java.althgriom.hot100.entity.ListNode;

import java.util.Stack;

/**
 * @Description:  输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
 * @Author: leiline
 * @CreateTime: 2022-06-24
 */
public class ListReversePrint {

    private static int[] reversePrint(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        ListNode p = head;
        int count = 0;
        while (p != null) {
            int value = p.val;
            stack.push(value);
            p = p.next;
            count ++;
        }

        int[] result = new int[count];

        for (int i=0; i<count; i++) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        node0.next = node1;
        node1.next = node2;

        System.out.println(reversePrint(node0));
    }
}
