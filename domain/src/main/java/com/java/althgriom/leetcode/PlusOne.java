package com.java.althgriom.leetcode;

public class PlusOne {

    public static int[]  plusOne(int[] digits) {

        boolean carry = false; // 是否进位

        int[] computed = digits;
        for (int i=digits.length -1; i>=0; i--) {

            if (i==(digits.length -1) ) {   // 针对最后一位
                if (digits[i] + 1 > 9) {
                    carry = true;
                }
                digits[i] = (digits[i] + 1) % 10;
            } else {                       // 针对非最后一位
                if (carry) {
                    digits[i] = (digits[i] + 1) % 10;
                    if (digits[i] != 0) {
                        carry = false;
                    }

                }
            }
        }

        if (digits[0] == 0) {
            int[] resize = new int[digits.length + 1];
            for (int i=1; i<digits.length + 1; i++) {
                resize[i] = digits[i-1];
            }
            resize[0] = computed[0] + 1;
            digits = resize;

        }

        return digits;
    }
}
