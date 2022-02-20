package com.java.althgriom2022.trees;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树中序遍历
 * @Author: leiline
 * @CreateTime: 2022-02-20
 */
public class InorderTraversa {

    private static List<Integer> result = new ArrayList<>();

    private static List<Integer> inorderTraversa(TreeNode root)  {


        if (root != null) {
            inorderTraversa(root.left);
            result.add(root.val);
            inorderTraversa(root.right);
        }

        return result;

    }


    public static void main(String[] args) {
        TreeNode nRoot = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);

        nRoot.right = n1;
        n1.left = n2;

        List<Integer> r = inorderTraversa(nRoot);
        for (int i : r) {
            System.out.print(i + " ");
        }

    }
}
