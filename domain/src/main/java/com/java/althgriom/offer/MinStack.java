package com.java.althgriom.offer;

import java.util.Stack;

/**
 * @Description: 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * @Author: leiline
 * @CreateTime: 2020-07-02
 */
public class MinStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> sortedStack = new Stack<>();

    private Integer min = Integer.MAX_VALUE;

    public MinStack() {

    }

    public void push(int x) {
       if (min > x) {
          min = x;
       }
       stack.push(x);
       stack.push(min);
    }

    public int pop() {
        stack.pop();
        return stack.pop();
    }

    public int top() {
        int pop = stack.pop();
        int peek = stack.peek();
        stack.push(pop);
        return peek;
    }

    public int min() {
        return stack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        System.out.println("push data: -2, 0, -3");
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        int pop = minStack.pop();
        System.out.println("pop stack: " + pop);
        int top = minStack.top();     // --> 返回 0.
        System.out.println("top stack: " + top);
        int min = minStack.min();     // --> 返回 -2.
        System.out.println("min stack: " + min);


        // ["MinStack","push","push","push","top","pop","min","pop","min","pop","push","top","min","push","top","min","pop","min"]
        //[[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]

        MinStack minStack1 = new MinStack();
        minStack1.push(2147483646);
        minStack1.push(2147483646);
        minStack1.push(2147483647);
        minStack1.top();
        minStack1.pop();
        minStack1.min();
        minStack1.pop();
        minStack1.min();
        minStack1.pop();
        minStack1.push(2147483647);
        minStack1.top();
        minStack1.min();
        minStack1.push(-2147483648);
        minStack1.top();
        minStack1.min();
        minStack1.pop();
        minStack1.min();

    }
}
