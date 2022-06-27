package com.java.althgriom2022.trees;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-06-24
 */
public class IsSubTree {

    private static boolean recur(TreeNode A, TreeNode B) {

        if (B == null) {
            // B已经遍历完成
            return true;
        }

        if (A == null) {
            // A已经遍历完成
            return false;
        }

        if (A.val == B.val) {
            return recur(A.left, B.left) && recur(A.right, B.right);
        }

        return false;
    }



    public static void main(String[] args) {
        TreeNode a0 = new TreeNode(1);
        TreeNode a1 = new TreeNode(2);
        TreeNode a2 = new TreeNode(3);

        a0.left = a1;
        a0.right = a2;

        TreeNode b0 = new TreeNode(3);
        TreeNode b1 = new TreeNode(1);
        b0.left = b1;

        // System.out.println(isSubStructure(a0, b0));
    }
}
