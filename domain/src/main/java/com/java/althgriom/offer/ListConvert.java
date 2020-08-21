package com.java.althgriom.offer;

/**
 * @Description: 链表两两反转
 * input: 1->2->3->4->5
 * output: 2->1->4->3->5
 * @Author: leiline
 * @CreateTime: 2020-08-21
 */
public class ListConvert {


//    public static ListNode convert(ListNode head) {
//        ListNode p = head;
//        ListNode q = head.next;
//
//
//        while (q!=null) {
//            p.next = q.next;
//            q.next = p;
//
//            ListNode temp = p;
//            p = q;
//            q = temp;
//
//            if (q.next != null) {
//                q = q.next.next;
//                p = q.next;
//            } else {
//                break;
//            }
//
//        }
//
//        return p;
//
//    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1); // 创建虚拟头结点
        dummy.next = head;

        head = dummy;

        while (head.next != null && head.next.next != null) {
            ListNode a = head.next;
            ListNode b = a.next;

            head.next = b;
            a.next = b.next;
            b.next = a;

            head = a;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);

        head.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        ListNode ans = swapPairs(head);
        while (ans!=null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
