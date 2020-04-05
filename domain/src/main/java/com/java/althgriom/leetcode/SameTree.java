package com.java.althgriom.leetcode;

import com.java.althgriom.leetcode.entity.TreeNode;

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p==null && q==null) {
            return true;
        }else if (p == null && q != null) {
            return false;
        } else if (p != null && q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


}
