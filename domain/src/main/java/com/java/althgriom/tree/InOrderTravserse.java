package com.java.althgriom.tree;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description:  先序遍历
 * @Author: leiline
 * @CreateTime: 2020-06-30
 */
public class InOrderTravserse {

    public static void inOrderTraverse(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            inOrderTraverse(root.left);
            inOrderTraverse(root.right);
        }
    }
}
