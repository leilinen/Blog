package com.java.althgriom2022.trees;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-06-24
 */
public class SymmetricTree {

    private static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return compare(root.left, root.right);
    }

    private static boolean compare(TreeNode left, TreeNode right) {

        if (left == null && right != null) {
            return false;
        } else if (left != null && right == null) {
            return false;
        } else if (left == null && right == null) {
            return true;
        } else if (left.val != right.val) {
            return false;
        }
        return compare(left.left, right.right) && compare(left.right, right.left);

    }


    public static void main(String[] args) {
        TreeNode node0 = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(3);

        node0.left = node1;
        node0.right = node2;
        node1.left = node3;
        node2.right = node4;

        System.out.println(isSymmetric(node0));
    }
}
