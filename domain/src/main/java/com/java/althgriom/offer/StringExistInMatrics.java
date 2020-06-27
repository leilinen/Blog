package com.java.althgriom.offer;

/**
 * @Description: 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
 *
 * @Author: leiline
 * @CreateTime: 2020-06-27
 */
public class StringExistInMatrics {

    public static boolean exist(char[][] board, String word) {

        if (board == null || board.length == 0) return false;
        char[] words = word.toCharArray();
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if (i >= board.length || i< 0 || j>=board[0].length || j< 0 || board[i][j] != word[k]) return false;

        if ( k == word.length -1) return true;

        char tmp = board[i][j];
        board[i][j] = '\u0001';

        boolean res = dfs(board, word, i+1, j, k+1) || dfs(board, word, i-1, j, k+1)
                || dfs(board, word, i, j+1, k+1) || dfs(board, word, i, j-1, k+1);
        board[i][j] = tmp;
        return res;

    }
}
