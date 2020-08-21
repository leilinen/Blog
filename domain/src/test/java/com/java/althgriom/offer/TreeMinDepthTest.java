package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-21
 */
public class TreeMinDepthTest {

    @Test
    public void minDepth() {

        TreeNode root = new TreeNode(3);
        TreeNode a1 = new TreeNode(9);
        TreeNode a2 = new TreeNode(20);
        TreeNode a3 = new TreeNode(15);
        TreeNode a4 = new TreeNode(7);

        root.left = a1;
        root.right = a2;
        a2.left = a3;
        a2.right = a4;

        Assert.assertEquals(TreeMinDepth.minDepth(root), 2);
    }
}