package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-17
 */
public class LevelOrderTest {

    @Test
    public void levelOrderTest() {

        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(9);

        root.left = node1;
        root.right = node2;

        node2.left = node3;
        node3.right = node4;

//        List<Integer> res = LevelOrder.levelOrder(root);
//        for (Integer r : res) {
//            System.out.print(r + " ");
//        }
//        System.out.println();
    }
}