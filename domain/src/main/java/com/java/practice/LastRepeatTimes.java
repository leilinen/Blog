package com.java.practice;

/**
 * @Description:  批--最后重复次数
 * @Author: leiline
 * @CreateTime: 2021-08-25
 */
public class LastRepeatTimes {

    private static String[] results = {"S", "S", "F", "F", "S", "F", "S", "S", "S", "F", "F", "F"};

    public static void main(String[] args) {

        int times = 0;

        for (String r: results) {
           if (r.equals("S")) {
               times = 0;
               System.out.println(times);
           } else if (r.equals("F")) {
               times ++ ;
               System.out.println(times);
           } else {
               times = 0;
               System.out.println(times);
           }
        }


    }

}
