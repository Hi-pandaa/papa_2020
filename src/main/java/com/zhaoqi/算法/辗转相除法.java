package com.zhaoqi.算法;

/**
 * @author zhaoqi
 * @since 2020-05-28
 */

public class 辗转相除法 {


    public static void main(String[] args) {

        int a = 15;
        int b = 21;
        int res = 辗转相除法.最大公约数(a, b);
        System.out.println(res);


    }
    public static int 最大公约数(int a, int b) {


        int big;
        int small;
        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }
        //21 15
        //15 6
        //6 3
        //3 0
        int temp;
        while (small != 0) {
            temp = small;
            small = big % small; // 21 %15 =6
            big = temp;
        }
        return big;
    }
}
