package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description: 输入两棵二叉树A和B，判断B是不是A的子结构。
 * @Author: leiline
 * @CreateTime: 2020-06-29
 */
public class IsSubStructure {

    public static boolean isSubStructure(TreeNode A, TreeNode B) {

        if (A != null && B!=null) {
            if (A.val == B.val) {
                boolean matched = treeMatch(A, B);
                return matched;
            } else {
                return isSubStructure(A.left, B) || isSubStructure(A.right, B);
            }
        }

        return false;
    }

    private static boolean treeMatch(TreeNode A, TreeNode B) {
        if (A == null) {
            return false;
        }

        if (B == null) {
            return false;
        }
        if (A.val == B.val) {
            return true;
        }

        return treeMatch(A.right, B.right) || treeMatch(A.left, B.left);
    }
}

