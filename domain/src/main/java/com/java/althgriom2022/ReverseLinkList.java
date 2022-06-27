package com.java.althgriom2022;

import com.java.althgriom.hot100.entity.ListNode;
import scala.collection.immutable.List;

/**
 * @Description: 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * @Author: leiline
 * @CreateTime: 2022-06-24
 */
public class ReverseLinkList {

    private static ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode result = null;

        while (p != null) {

            ListNode temp = new ListNode(p.val);
            temp.next = result;
            result = temp;

            p = p.next;
        }

        return result;
    }

    // 2. 递归解法
    private static ListNode reverseList2(ListNode head) {
        return recur(head, null);
    }

    private static ListNode recur(ListNode cur, ListNode pre) {
        if (cur == null) {
            return pre;
        }

        ListNode res = recur(cur.next, cur);
        cur.next = pre;
        return res;
    }

    public static void main(String[] args) {
        ListNode node0 = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode result = reverseList(node0);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
