package com.java.althgriom.leetcode;

import com.java.althgriom.leetcode.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameTreeTest {

    @Test
    public void isSameTree() {

        TreeNode root1 = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(1);

        TreeNode root2 = new TreeNode(1);
        TreeNode left2 = new TreeNode(1);
        TreeNode right2 = new TreeNode(2);

        root1.left = left1;
        root1.right = right1;

        root2.left = left2;
        root2.right = right2;

        Assert.assertFalse(SameTree.isSameTree(root1, root2));
    }
}