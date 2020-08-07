package com.java.althgriom.althgriompattern.tree;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description: 非递归中序遍历
 * @Author: leiline
 * @CreateTime: 2020-08-01
 */
public class NonRecursionInorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {

            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
        }
        return result;
    }
}
