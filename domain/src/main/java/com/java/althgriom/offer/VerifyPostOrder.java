package com.java.althgriom.offer;

/**
 * @Description:  输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。
 * 如果是则返回 true，否则返回 false。
 * @Author: leiline
 * @CreateTime: 2020-07-25
 */
public class VerifyPostOrder {

    public static boolean verifyPostorder(int[] postorder) {

        boolean verify = true;

        if (postorder.length <= 1) {
            return verify;
        }

        return verifyPostOrder(postorder, (postorder.length -1), postorder[postorder.length-1]);

    }

    private static boolean verifyPostOrder(int[] postorder, int length, int root) {

        boolean flag = false;
        if (length < 1) {
            return true;
        }

        for (int i=0; i<length; i++) {
            if (postorder[i] > root) {
                flag = true;
            }

            if (flag && postorder[i] < root) { // 校验失败
                return false;
            }
        }

        return verifyPostOrder(postorder, length -1, postorder[length-1]);
    }

}
