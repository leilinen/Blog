package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description:  请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * @Author: leiline
 * @CreateTime: 2020-06-30
 */
public class MirrorTree {

    public  static TreeNode mirrorTree(TreeNode root) {

        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;

            mirrorTree(root.left);
            mirrorTree(root.right);
        }
        return root;
    }

}
