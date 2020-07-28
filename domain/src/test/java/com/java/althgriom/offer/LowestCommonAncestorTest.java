package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-28
 */
public class LowestCommonAncestorTest {

    @Test
    public void lowestCommonAncestorTest() {

        TreeNode root = new TreeNode(3);

        TreeNode a1 = new TreeNode(5);
        TreeNode a2 = new TreeNode(1);
        TreeNode a3 = new TreeNode(6);
        TreeNode a4 = new TreeNode(2);
        TreeNode a5 = new TreeNode(0);
        TreeNode a6 = new TreeNode(8);
        TreeNode a7 = new TreeNode(7);
        TreeNode a8 = new TreeNode(4);

        root.left = a1;
        root.right = a2;
        a1.left = a3;
        a1.right = a4;
        a4.left = a7;
        a4.right = a8;
        a2.left = a5;
        a2.right = a6;

        TreeNode ans = LowestCommonAncestor.lowestCommonAncestor(root, a1, a2);
        Assert.assertEquals(ans.val, root.val);
    }


    @Test
    public void lowestCommonAncestorTest2() {

        TreeNode root = new TreeNode(3);

        TreeNode a1 = new TreeNode(5);
        TreeNode a2 = new TreeNode(1);
        TreeNode a3 = new TreeNode(6);
        TreeNode a4 = new TreeNode(2);
        TreeNode a5 = new TreeNode(0);
        TreeNode a6 = new TreeNode(8);
        TreeNode a7 = new TreeNode(7);
        TreeNode a8 = new TreeNode(4);

        root.left = a1;
        root.right = a2;
        a1.left = a3;
        a1.right = a4;
        a4.left = a7;
        a4.right = a8;
        a2.left = a5;
        a2.right = a6;

        TreeNode ans = LowestCommonAncestor.lowestCommonAncestor(root, a3, a5);
        Assert.assertEquals(ans.val, root.val);
    }
}