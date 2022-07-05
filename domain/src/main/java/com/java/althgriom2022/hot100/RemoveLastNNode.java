package com.java.althgriom2022.hot100;

import com.java.althgriom.hot100.entity.ListNode;

/**
 * @Description: https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
 * @Author: leiline
 * @CreateTime: 2022-07-01
 */
public class RemoveLastNNode {

    private static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode p = head;
        ListNode q = head;

        for (int i=0; i< n; i++) {
            p = p.next;
        }

        // 删除头节点
        if (p == null) {
            return q.next;
        }

        while ( p.next!=null) {
            p = p.next;
            q = q.next;
        }

        q.next = q.next.next;

        return head;
    }


    public static void main(String[] args) {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode r = removeNthFromEnd(node0, 2);
    }
}
