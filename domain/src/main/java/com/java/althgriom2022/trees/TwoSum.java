package com.java.althgriom2022.trees;


import com.java.althgriom.hot100.entity.ListNode;

/**
 * @Description: https://leetcode.cn/problems/add-two-numbers/
 * @Author: leiline
 * @CreateTime: 2022-06-29
 */
public class TwoSum {

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode p0 = l1;
        ListNode p1 = l2;
        int temp = 0;

        ListNode result = new ListNode(-1);
        ListNode r = result;

        while (p0 != null && p1 != null) {
            int sum = p0.val + p1.val + temp;
            temp = sum / 10;
            int val = temp > 0? sum % 10: sum;
            ListNode node = new ListNode(val);
            r.next = node;

            r = r.next;
            p0 = p0.next;
            p1 = p1.next;
        }

        while (p0 != null) {
            int sum = p0.val + temp;
            temp = sum / 10;
            int val = temp > 0? sum % 10: sum;
            ListNode node = new ListNode(val);
            r.next = node;

            r = r.next;
            p0 = p0.next;
        }

        while (p1 != null) {
            int sum = p1.val + temp;
            temp = sum / 10;
            int val = temp > 0? sum % 10: sum;
            ListNode node = new ListNode(val);
            r.next = node;

            r = r.next;
            p1 = p1.next;
        }

        if (temp > 0) {
            ListNode node = new ListNode(temp);
            r.next = node;
        }

        return result.next;

    }


    public static void main(String[] args) {
        ListNode node00 = new ListNode(9);
        ListNode node01 = new ListNode(9);
        ListNode node02 = new ListNode(9);
        ListNode node03 = new ListNode(9);
        ListNode node04 = new ListNode(9);
        ListNode node05 = new ListNode(9);
        ListNode node06 = new ListNode(9);

        node00.next = node01;
        node01.next = node02;
        node02.next = node03;
        node03.next = node04;
        node04.next = node05;
        node05.next = node06;

        ListNode node10 = new ListNode(9);
        ListNode node11 = new ListNode(9);
        ListNode node12 = new ListNode(9);
        ListNode node13 = new ListNode(9);

        node10.next = node11;
        node11.next = node12;
        node12.next = node13;

        ListNode result =  addTwoNumbers(node00, node10);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
