package com.java.althgriom.leetcode;

import com.java.althgriom.leetcode.entity.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字
 * @Author: leiline
 * @CreateTime: 2020-06-26
 */
public class RebuildTree {

    private int[] preorder; // 前序遍历
    private Map<Integer, Integer> reverses;


    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int preLen = preorder.length;
        int inLen = inorder.length;

        if (preLen != inLen) {
            return null;
        }

        reverses = new HashMap<>();
        for (int i=0; i<inLen; i++) {
            reverses.put(inorder[i], i);
        }

        return buildTree(0, preLen -1, 0, inLen - 1);

    }

    private TreeNode buildTree(int preL, int preR, int inL, int inR) {
        if (preL > preR || inL > inR) {
            return null;
        }

        int pivot = preorder[preL];
        TreeNode root = new TreeNode(pivot);

        int pivotIndex = reverses.get(pivot);

        root.left = buildTree(preL + 1, preL + (pivotIndex - inL), inL, pivotIndex - 1);
        root.right = buildTree(preL + (pivotIndex - inL) + 1, preR, pivotIndex+1, inR);
        return root;
    }

}



