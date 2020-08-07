package com.java.althgriom.althgriompattern.tree;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 深度优先遍历--分治法
 * @Author: leiline
 * @CreateTime: 2020-08-01
 */
public class DfsDivideTraversal {

    public static List<Integer> preorderTraversal(TreeNode root) {
        return divideAndConquer(root);
    }

    private static List<Integer> divideAndConquer(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // divide
        List<Integer> left = divideAndConquer(root.left);
        List<Integer> right = divideAndConquer(root.right);

        // conquer
        result.add(root.val);
        result.addAll(left);
        result.addAll(right);
        return result;

    }
}
