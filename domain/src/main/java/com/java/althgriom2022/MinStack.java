package com.java.althgriom2022;

import java.util.LinkedList;

/**
 * @Description:  定义栈的数据结构，
 * 请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * @Author: leiline
 * @CreateTime: 2022-06-24
 */
public class MinStack {

   private LinkedList<Integer> minValue;

    private LinkedList<Integer> stack;

    public MinStack() {
        this.stack = new LinkedList<>();
        this.minValue = new LinkedList<>();
    }

    public void push(int x) {
        this.stack.addLast(x);
        if (this.minValue.size() > 0 && minValue.getLast() <= x) {
            this.minValue.addLast(minValue.getLast());
        } else {
            this.minValue.addLast(x);
        }
    }

    public void pop() {
        minValue.removeLast();
        stack.removeLast();

    }

    public int top() {
        return stack.getLast();
    }

    public int min() {
        return minValue.removeLast();
    }

    public static void main(String[] args) {
        MinStack min = new MinStack();
        min.push(-2);
        min.push(0);
        min.push(-3);
        System.out.println(min.min());   // -3
        min.pop();
        System.out.println(min.top());   // 0.
        System.out.println(min.min());   // -2.


    }
}
