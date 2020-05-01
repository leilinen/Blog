package com.java.althgriom.leetcode;

import com.java.althgriom.leetcode.entity.TreeNode;

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {

        if (root.left == null && root.right == null) {
            return true;
        } else if (root.right == null) {
            return false;
        } else if (root.left == null) {
            return false;
        } else if (root.right.val != root.left.val) {
            return false;
        }

        return isSymmetric(root.right) && isSymmetric(root.left);

    }


}
