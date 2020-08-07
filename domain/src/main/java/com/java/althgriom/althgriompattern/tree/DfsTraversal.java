package com.java.althgriom.althgriompattern.tree;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 深度优先遍历，即前序遍历
 * @Author: leiline
 * @CreateTime: 2020-08-01
 */
public class DfsTraversal {

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private static void dfs (TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        dfs(root.left, result);
        dfs(root.right, result);

    }


}
