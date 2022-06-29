package com.java.althgriom2022.trees;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-06-28
 */
public class kthLargest {

    private static LinkedList<Integer> list = new LinkedList();

    private static int kthLargest(TreeNode root, int k) {
        recur(root);
        return list.get(list.size() - k);
    }

    private static void recur(TreeNode root) {

        if (root.left != null) {
            recur(root.left);
        }

        list.add(root.val);

        if (root.right != null) {
            recur(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode node0 = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(1);

        node0.left = node1;
        node0.right = node2;
        node1.left = node3;
        node1.right = node4;
        node3.left = node5;

        System.out.println(kthLargest(node0, 3));
    }
}
