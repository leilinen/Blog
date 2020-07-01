package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description: 请实现一个函数，用来判断一棵二叉树是不是对称的。
 * @Author: leiline
 * @CreateTime: 2020-06-30
 */
public class TreeIsSymmetric {

    public static boolean isSymmetric(TreeNode root) {

        if (root != null) {
            return isSymmetric(root.left, root.right);
        } else {
            return true;
        }

    }

    private static boolean isSymmetric(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        } else {
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        }
    }
}
