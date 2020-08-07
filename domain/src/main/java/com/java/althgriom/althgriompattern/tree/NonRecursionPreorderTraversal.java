package com.java.althgriom.althgriompattern.tree;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description:  非递归前序遍历
 * @Author: leiline
 * @CreateTime: 2020-08-01
 */
public class NonRecursionPreorderTraversal {

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        stack.push(root);

        while (stack.size() !=0) {
            // 前序遍历，先保存结构
            TreeNode node = stack.pop();
            result.add(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return result;
    }

}
