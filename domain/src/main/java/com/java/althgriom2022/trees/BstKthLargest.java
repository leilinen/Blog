package com.java.althgriom2022.trees;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description: 二叉搜索树第k大节点
 * @Author: leiline
 * @CreateTime: 2022-03-27
 */
public class BstKthLargest {

    public static int kthLargest(TreeNode root, int k) {

        int depth = depth(root);
        if (k==depth) {
            return root.val;
        } else if (k > depth) {
            return kthLargest(root.left, k);
        } else {
            return kthLargest(root.right, k);
        }
    }

    public static int depth(TreeNode root) {

        int depth = 0;

        if (root != null) {

            depth  = Math.max(depth(root.left), depth(root.right)) + 1;

        }
        return depth;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(2);

        root.left = node1;
        root.right = node2;
        node1.left = node3;

        System.out.println(kthLargest(root, 1));
    }


}
