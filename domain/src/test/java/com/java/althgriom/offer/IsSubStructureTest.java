package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-06-29
 */
public class IsSubStructureTest {

    @Test
    public void isSubStructureTest() {

        TreeNode rootA = new TreeNode(3);
        TreeNode a1 = new TreeNode(4);
        TreeNode a2 = new TreeNode(5);
        TreeNode a3 = new TreeNode(1);
        TreeNode a4 = new TreeNode(2);

        rootA.left = a1;
        rootA.right = a2;
        a1.left = a3;
        a1.right = a4;

        TreeNode rootB = new TreeNode(4);
        TreeNode b1 = new TreeNode(1);
        rootB.left = b1;



        Assert.assertTrue(IsSubStructure.isSubStructure(rootA, null));
    }
}