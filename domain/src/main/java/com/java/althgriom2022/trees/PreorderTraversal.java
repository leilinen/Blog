package com.java.althgriom2022.trees;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description: 前序遍历二叉树
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * @Author: leiline
 * @CreateTime: 2022-02-20
 */
public class PreorderTraversal {

    public static List<Integer> result = new ArrayList<>();

    private static List<Integer> preorderTraversal(TreeNode root) {

        if (root != null) {
            result.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return result;

    }

    private static List<Integer> preorderTraversalNorecursive (TreeNode root) {

        Stack<TreeNode> s = new Stack<>();

        TreeNode cur;

        s.push(root);

        while (root!=null && !s.isEmpty()) {
            cur = s.pop();
            result.add(cur.val);
            if (cur.right != null) {
                s.push(cur.right);
            }
            if (cur.left != null) {
                s.push(cur.left);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        TreeNode nRoot = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);

        nRoot.right = n1;
        n1.left = n2;

        List<Integer> r = preorderTraversalNorecursive(nRoot);
        for (int i : r) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
