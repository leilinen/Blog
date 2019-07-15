package com.java.althgriom.nowcode;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
        this.next = null;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getVal() {
        return this.val;
    }

    public ListNode getNext() {
        return next;
    }
}
