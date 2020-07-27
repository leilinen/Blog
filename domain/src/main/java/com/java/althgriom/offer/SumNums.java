package com.java.althgriom.offer;

/**
 * @Description: 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @Author: leiline
 * @CreateTime: 2020-07-27
 */
public class SumNums {

    public  static int sumSums(int n) {

        boolean flag = n > 0 && (n += sumSums(n - 1)) > 0;
        return n;
    }


}
