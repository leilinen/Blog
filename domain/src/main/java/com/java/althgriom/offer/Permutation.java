package com.java.althgriom.offer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:  输入一个字符串，打印出该字符串中字符的所有排列。
 * @Author: leiline
 * @CreateTime: 2020-07-18
 */
public class Permutation {

    List<String> res = new LinkedList<>();

    private char[] c;

    public String[] permutation(String s) {
        this.c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    private void dfs(int x) {
        if (x == c.length - 1) {
            res.add(String.valueOf(c));
            return;
        }

        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < c.length; i++) {
            if (set.contains(c[i])) {
                continue;
            }
            set.add(c[i]);
            swap(i, x);
            dfs( x + 1); // 开启固定第x+1位字符
            swap(i, x); // 恢复交换
        }
    }

    private void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }

    public static void main(String[] args) {

        Permutation permutation1 = new Permutation();

        String a1 = "abc";
        String[] res1 = permutation1.permutation(a1);
        System.out.println("######################");
        System.out.println("abc can be arrangement to ");
        for (String res: res1) {
            System.out.print(res + " ");
        }
        System.out.print("\n");

        Permutation permutation2 = new Permutation();
        String a2 = "abb";
        String[] res2 = permutation2.permutation(a2);
        System.out.println("######################");
        System.out.println("abb can be arrangement to ");
        for (String res: res2) {
            System.out.print(res + " ");
        }
        System.out.print("\n");

    }
}
