package com.java.althgriom.leetcode.daily;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description: 给定一个二叉树，找出其最大深度.
 * @Author: leiline
 * @CreateTime: 2020-07-28
 */
public class TreeDeepth {

    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
