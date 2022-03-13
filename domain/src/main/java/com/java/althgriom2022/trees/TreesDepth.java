package com.java.althgriom2022.trees;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description: https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * 二叉树的最大深度
 * @Author: leiline
 * @CreateTime: 2022-03-13
 */
public class TreesDepth {


    public static int maxDepth(TreeNode root) {

        int depth = 0;

        if (root != null) {

            depth  = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

        }
        return depth;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        System.out.println(maxDepth(root));
    }
}
