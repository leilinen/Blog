package com.java.althgriom2022.trees;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description:  https://leetcode-cn.com/problems/balanced-binary-tree/
 * 判断二叉树是否是平衡二叉树
 * @Author: leiline
 * @CreateTime: 2022-03-13
 */
public class IsBalancedTree {

    public static boolean isBalanced(TreeNode root) {

        if (root != null) {
            if (Math.abs(depth(root.left) - depth(root.right)) > 1) {
                return false;
            }
        }
        return true;

    }

    private static int depth(TreeNode root) {
        int depth = 0;
        if (root != null) {
            depth  = Math.max(depth(root.left), depth(root.right)) + 1;
        }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root1.left = node1;
        root1.right = node2;
        node2.left = node3;
        node2.right = node4;

        System.out.println(isBalanced(root1));

        TreeNode root2 = new TreeNode(1);
        TreeNode node21 = new TreeNode(2);
        TreeNode node22 = new TreeNode(2);
        TreeNode node23 = new TreeNode(3);
        TreeNode node24 = new TreeNode(3);
        TreeNode node25 = new TreeNode(4);
        TreeNode node26 = new TreeNode(4);

        root2.left = node21;
        root2.right = node22;
        node21.left = node23;
        node21.right = node24;
        node23.left = node25;
        node23.right = node26;

        System.out.println(isBalanced(root2));

    }
}
