package com.java.althgriom.althgriompattern.tree;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description:  递归式前序遍历
 * @Author: leiline
 * @CreateTime: 2020-08-01
 */
public class PreorderTraversal {


    public static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}
