package com.java.althgriom.leetcode.daily;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description: 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * @Author: leiline
 * @CreateTime: 2020-07-03
 */
public class SortedArrayToBST {

    public static TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private static TreeNode dfs(int[] nums, int lo, int hi) {

        if (lo > hi) {
            return null;
        }


        int mid =  lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums, lo, mid - 1);
        root.right = dfs(nums, mid + 1, hi);
        return root;

    }
}
