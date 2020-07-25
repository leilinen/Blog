package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Description: 二叉树层次遍历
 * @Author: leiline
 * @CreateTime: 2020-07-25
 */
public class LevelOrder2 {

    private static Queue<TreeNode> queue = new ArrayDeque<>();


    public static int[] levelOrder(TreeNode root) {

        List<Integer> treeNodes = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            treeNodes.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

        }

        int[] res = new int[treeNodes.size()];
        for (int i=0; i<treeNodes.size(); i++) {
            res[i] = treeNodes.get(i);
        }

        return res;
    }
}
