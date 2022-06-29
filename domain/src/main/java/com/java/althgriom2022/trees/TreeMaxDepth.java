package com.java.althgriom2022.trees;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-06-28
 */
public class TreeMaxDepth {


    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }

    public static void main(String[] args) {
        TreeNode node0 = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        node0.left = node1;
        node0.right = node2;
        node2.left = node3;
        node3.right = node4;
        System.out.println(maxDepth(node0));
    }
}
