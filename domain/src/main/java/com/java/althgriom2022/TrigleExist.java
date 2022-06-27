package com.java.althgriom2022;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-06-24
 */
public class TrigleExist {


    private static boolean exist(char[][] board, String word) {

        char[] words = word.toCharArray();
        return true;

    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        System.out.println(exist(board, "ABCCED"));

    }
}
