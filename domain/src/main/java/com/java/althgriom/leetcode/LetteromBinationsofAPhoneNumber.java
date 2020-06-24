package com.java.althgriom.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 *
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 考察 DFS 深度优先遍历算法
 */
public class LetteromBinationsofAPhoneNumber {

    private  Map<Integer, String[]> numberToLetter = new HashMap<>();
    private List<String> res = new ArrayList<>();

    public LetteromBinationsofAPhoneNumber() {
        String[] n1 = {};
        String[] n2 = {"a", "b", "c"};
        String[] n3 = {"d", "e", "f"};
        String[] n4 = {"g", "h", "i"};
        String[] n5 = {"j", "k", "l"};
        String[] n6 = {"m", "n", "o"};
        String[] n7 = {"p", "q", "r", "s"};
        String[] n8 = {"t", "u", "v"};
        String[] n9 = {"w", "x", "y", "z"};

        numberToLetter.put(2, n2);
        numberToLetter.put(3, n3);
        numberToLetter.put(4, n4);
        numberToLetter.put(5, n5);
        numberToLetter.put(6, n6);
        numberToLetter.put(7, n7);
        numberToLetter.put(8, n8);
        numberToLetter.put(9, n9);
    }

    public  List<String> letterCombinations(String digits) {
        if (digits.length() < 1) {
            return res;
        }
        findCombination(digits, 0, "");
        return res;
    }

    private void findCombination(String digits, int index, String s) {
        if (index == digits.length()) {
            res.add(s);
            return;
        }
        Character c = digits.charAt(index);
        String[] letters = numberToLetter.get(c - '0');
        for (int i=0; i<letters.length; i++) {
            findCombination(digits, index +1, s + letters[i]);
        }
        return;
    }

    public static void main(String[] args) {
        LetteromBinationsofAPhoneNumber letteromBinationsofAPhoneNumber = new LetteromBinationsofAPhoneNumber();
        List<String> letters = letteromBinationsofAPhoneNumber.letterCombinations("");
        System.out.println(letters.toString());
    }
}
