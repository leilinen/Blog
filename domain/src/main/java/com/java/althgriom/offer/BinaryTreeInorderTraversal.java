package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 *
 * 给定一个二叉树，返回它的中序 遍历。
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * @Author: leiline
 * @CreateTime: 2020-08-21
 */
public class BinaryTreeInorderTraversal {

    private static List<Integer> list = new ArrayList<>();

    // 递归用法
    public static List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return list;
        }

        if (root.left != null) {
            inorderTraversal(root.left);
        }

        list.add(root.val);

        if (root.right != null) {
            inorderTraversal(root.right);
        }

        return list;

    }

    //todo 非递归用法



}
