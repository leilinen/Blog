package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;
import com.java.althgriom.tree.InOrderTravserse;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-30
 */
public class MirrorTreeTest {

    @Test
    public void mirrorTreeTest() {
        
        TreeNode node0 = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);
        
        node0.left = node1;
        node0.right = node2;
        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        TreeNode root = MirrorTree.mirrorTree(node0);
        InOrderTravserse.inOrderTraverse(root);
        System.out.println();

    }


}