package com.java.althgriom2022.trees;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-06-24
 */
public class MirrorTree {

    private static TreeNode mirrorTree(TreeNode root) {

        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        } else {
            return root;
        }
        if (root.left != null) {
            mirrorTree(root.left);
        }

        if (root.right != null) {
            mirrorTree(root.right);
        }
        return root;
    }

    public static void main(String[] args) {

        TreeNode result0 = mirrorTree(null);
        System.out.println(result0);

        TreeNode a0 = new TreeNode(4);
        TreeNode a1 = new TreeNode(2);
        TreeNode a2 = new TreeNode(7);
        TreeNode a3 = new TreeNode(1);

        a0.left = a1;
        a0.right = a2;
        a2.left = a3;

        TreeNode result = mirrorTree(a0);
        System.out.println(result);
    }
}
