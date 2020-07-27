package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description: 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。
 * @Author: leiline
 * @CreateTime: 2020-07-26
 */
public class PathSum {

    private static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {

       dfs(root, sum, 0, new ArrayList<>());
       return ans;
    }

    public static void dfs(TreeNode root, int sum, int value, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        if (sum == value + root.val && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(list));
        }
        dfs(root.left, sum, value + root.val, list);
        dfs(root.right, sum, value + root.val, list);
        list.remove(list.size() -1);
    }
}
