package com.java.althgriom2022.trees;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-06-28
 */
public class LevelOrderTreeIII {

    private static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);
        }

        int count = 1;

        while (!queue.isEmpty()) {

            List<Integer> perLine = new ArrayList<>();

            int size = queue.size();
            for (int i=0; i < size; i++) {
                TreeNode node = queue.poll();
                perLine.add(node.val);
                if (count % 2 == 1) {
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                } else {
                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
            count++;
            result.add(perLine);
        }

        return result;
    }


    public static void main(String[] args) {
        TreeNode node0 = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        node0.left = node1;
        node0.right = node2;
        node1.left = node3;
        node2.right = node4;

        levelOrder(node0);
    }
}
