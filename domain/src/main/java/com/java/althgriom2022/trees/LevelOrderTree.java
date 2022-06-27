package com.java.althgriom2022.trees;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.*;

/**
 * @Description: 从上到下打印二叉树
 * @Author: leiline
 * @CreateTime: 2022-06-25
 */
public class LevelOrderTree {


    private static int[] levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        List<Integer> result = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            result.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }


        }
        int[] rArry = new int[result.size()];
        for (int i = 0; i< result.size(); i++ ) {
            rArry[i] = result.get(i);
        }
        return rArry;
    }

    public static void main(String[] args) {

        TreeNode node0 = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        node0.left = node1;
        node0.right = node2;
        node2.left = node3;
        node2.right = node4;

        int[] result = levelOrder(node0);
        System.out.println(result);


    }
}
