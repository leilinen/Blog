package com.java.althgriom.offer;

import java.util.Stack;

/**
 * @Description: 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author: leiline
 * @CreateTime: 2020-06-27
 */
public class CQueue {

    private Stack<Integer> stack1 = new Stack<>();  // 入队栈
    private Stack<Integer> stack2 = new Stack<>();  // 出队栈

    public CQueue() {

    }

    /***
     * 在队列尾部插入整数
     * @param value
     */
    public void appendTail(int value) {
        stack1.push(value);
    }

    /***
     * 在队列头部删除整数
     * @return
     */
    public int deleteHead() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }

        if (!stack2.isEmpty()) {
            return stack2.pop();
        }


        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        if (stack2.isEmpty()) {
            return -1;
        } else {
            return stack2.pop();
        }

    }


    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        System.out.println("################### init c queue ###############");
        System.out.println("appendTail 3, ");
        cQueue.appendTail(3);
        System.out.println("delete Head, value =  " + cQueue.deleteHead());
        System.out.println("delete Head, value =  " + cQueue.deleteHead());

        CQueue cQueue2 = new CQueue();
        System.out.println("################### init c queue 2###############");
        System.out.println("delete Head, value =  " + cQueue2.deleteHead());
        System.out.println("appendTail 5, ");
        cQueue2.appendTail(5);
        System.out.println("appendTail 2, ");
        cQueue2.appendTail(2);
        System.out.println("delete Head, value =  " + cQueue2.deleteHead());
        System.out.println("delete Head, value =  " + cQueue2.deleteHead());

        CQueue cQueue3 = new CQueue();
        System.out.println("################### init c queue 3###############");
        System.out.println("appendTail 1, ");
        cQueue3.appendTail(1);
        System.out.println("appendTail 2, ");
        cQueue3.appendTail(2);
        System.out.println("delete Head, value =  " + cQueue3.deleteHead());
        System.out.println("delete Head, value =  " + cQueue3.deleteHead());
        System.out.println("appendTail 3, ");
        cQueue3.appendTail(3);
        System.out.println("appendTail 4, ");
        cQueue3.appendTail(4);
        System.out.println("delete Head, value =  " + cQueue3.deleteHead());
        System.out.println("delete Head, value =  " + cQueue3.deleteHead());

    }
}
