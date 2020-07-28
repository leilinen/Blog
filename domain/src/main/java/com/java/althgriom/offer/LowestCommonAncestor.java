package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description: 二叉树的最近公共祖先
 * @Author: leiline
 * @CreateTime: 2020-07-28
 */
public class LowestCommonAncestor {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;


    }
}
