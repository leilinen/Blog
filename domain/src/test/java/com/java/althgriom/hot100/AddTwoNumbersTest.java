package com.java.althgriom.hot100;

import com.java.althgriom.hot100.entity.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-07
 */
public class AddTwoNumbersTest {


    @Test
    public void addTwoNumbersTest() {

        ListNode l10 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(3);
        l10.next = l11;
        l11.next = l12;

        ListNode l20 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);
        l20.next = l21;
        l21.next = l22;


        ListNode ans = AddTwoNumbers.addTwoNumbers(l10, l20);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;

        }
    }
}