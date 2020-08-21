package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-21
 */
public class BinaryTreeInorderTraversalTest {

    @Test
    public void inorderTraversal() {

        TreeNode root = new TreeNode(1);

        TreeNode a1 = new TreeNode(2);
        TreeNode a2 = new TreeNode(3);

        root.right = a1;
        a1.left = a2;

        List<Integer> list = BinaryTreeInorderTraversal.inorderTraversal(root);

        for (Integer i: list) {
            System.out.print(i + " ");
        }

    }
}