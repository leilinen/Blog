package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description: 输入一棵二叉树的根节点，求该树的深度。
 * @Author: leiline
 * @CreateTime: 2020-07-28
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {

       return root == null? 0: Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }
}
