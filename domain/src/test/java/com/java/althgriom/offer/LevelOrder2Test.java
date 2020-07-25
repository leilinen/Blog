package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-25
 */
public class LevelOrder2Test {

    @Test
    public void levelOrderTest() {

        TreeNode root = new TreeNode(3);
        TreeNode a1 = new TreeNode(9);
        TreeNode a2 = new TreeNode(20);
        TreeNode a3 = new TreeNode(15);
        TreeNode a4 = new TreeNode(7);

        root.left = a1;
        root.right = a2;
        a2.left = a3;
        a2.right = a4;

        int[] res = LevelOrder2.levelOrder(root);
        for (int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}