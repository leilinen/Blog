package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Description:  二叉树的层次遍历
 * @Author: leiline
 * @CreateTime: 2020-07-17
 */
public class LevelOrder {

    public static List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> levelRes = new ArrayList<>();
            for (int i=0; i<n; i++) {
                TreeNode node = queue.poll();
                levelRes.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(levelRes);
        }

        return res;

    }

}
