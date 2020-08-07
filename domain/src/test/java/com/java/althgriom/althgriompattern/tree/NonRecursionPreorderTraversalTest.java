package com.java.althgriom.althgriompattern.tree;

import com.java.althgriom.leetcode.entity.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-01
 */
public class NonRecursionPreorderTraversalTest {

    @Test
    public void preorderTraversalTest() {

        TreeNode root = new TreeNode(4);

        TreeNode a1 = new TreeNode(6);
        TreeNode a2 = new TreeNode(8);
        TreeNode a3 = new TreeNode(5);
        TreeNode a4 = new TreeNode(9);

        root.left = a1;
        root.right = a2;
        a1.left = a3;
        a1.right = a4;

        List<Integer> result = NonRecursionPreorderTraversal.preorderTraversal(root);
        for (Integer i : result) {
            System.out.print(i + " ");
        }

    }

    @Test
    public void preorderTraversalTest2() {

        TreeNode root = new TreeNode(4);

        TreeNode a1 = new TreeNode(6);
        TreeNode a2 = new TreeNode(8);
        TreeNode a3 = new TreeNode(5);
        TreeNode a4 = new TreeNode(9);

        root.left = a1;
        root.right = a2;
        a1.left = a3;
        a1.right = a4;

        List<Integer> result = NonRecursionInorderTraversal.inorderTraversal(root);
        for (Integer i : result) {
            System.out.print(i + " ");
        }

    }
}