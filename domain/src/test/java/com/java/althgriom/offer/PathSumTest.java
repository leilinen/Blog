package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-07-26
 */
public class PathSumTest {

    @Test
    public void pathSumTest() {

        TreeNode root = new TreeNode(5);

        TreeNode a1 = new TreeNode(4);
        TreeNode a2 = new TreeNode(8);
        TreeNode a3 = new TreeNode(11);
        TreeNode a4 = new TreeNode(13);
        TreeNode a5 = new TreeNode(4);
        TreeNode a6 = new TreeNode(7);
        TreeNode a7 = new TreeNode(2);
        TreeNode a8 = new TreeNode(5);
        TreeNode a9 = new TreeNode(1);

        root.left = a1;
        root.right = a2;
        a1.left = a3;
        a3.left = a6;
        a3.right = a7;
        a2.left = a4;
        a2.right = a5;
        a5.left = a8;
        a5.right = a9;

        int sum = 22;

        List<List<Integer>> res = PathSum.pathSum(root, sum);

        for (List<Integer> paths : res) {
            for (Integer v :  paths) {
                System.out.print(v+" ");
            }
            System.out.println();
        }

    }

    @Test
    public void pathSumTest2() {


        int sum = 1;

        List<List<Integer>> res = PathSum.pathSum(null, sum);

        for (List<Integer> paths : res) {
            for (Integer v :  paths) {
                System.out.print(v+" ");
            }
            System.out.println();
        }

    }
}