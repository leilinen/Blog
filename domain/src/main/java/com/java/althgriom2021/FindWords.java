package com.java.althgriom2021;

import com.java.althgriom.offer.FindNthDigit;

import java.util.*;

/**
 * @Description:
 *
 * 给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。
 *
 * @Author: leiline
 * @CreateTime: 2021-10-31
 */
public class FindWords {

    private final Map<Character, Integer> word = new HashMap<Character, Integer>(26);

    public FindWords() {


        word.put('q', 0);
        word.put('w', 0);
        word.put('e', 0);
        word.put('r', 0);
        word.put('t', 0);
        word.put('y', 0);
        word.put('u', 0);
        word.put('i', 0);
        word.put('o', 0);
        word.put('p', 0);

        word.put('a', 1);
        word.put('s', 1);
        word.put('d', 1);
        word.put('f', 1);
        word.put('g', 1);
        word.put('h', 1);
        word.put('j', 1);
        word.put('k', 1);
        word.put('l', 1);

        word.put('z', 2);
        word.put('x', 2);
        word.put('c', 2);
        word.put('v', 2);
        word.put('b', 2);
        word.put('n', 2);
        word.put('m', 2);

    }

    public  String[] findWords(String[] words) {

        List<String> res = new ArrayList<>();

        for (int i=0; i<words.length; i++) {
            char c = words[i].toLowerCase().charAt(0);
            int f = word.get(c);
            if (words.length <= 1) {
                res.add(words[i]);
            }

            int j = 0;
            for (; j<words[i].length(); j++) {
                if (f != words[i].charAt(j)) {
                    break;
                }
            }
            if (j == words[i].length() - 1) {
                res.add(words[i]);
            }

        }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {

        FindWords findWords = new FindWords();

        String[] words = {"Hello","Alaska","Dad","Peace"};
        String[] res = findWords.findWords(words);
        for (String r: res) {
            System.out.println(r);
        }
    }

}
