package com.zhaoqi.算法;

/**
 * @author zhaoqi
 * @since 2020-05-28
 */
public class 整数反转 {


    public static void main(String[] args) {

        System.out.println(整数反转.整数反转(1234));

    }


    public static int 整数反转(int num) {

        // num 1234
        // num 123 4       newNum: 0*10+4
        // num 12  3       newNum: 4*10+3=43
        // num 1   2       newNum: 43*10+2=432
        // num 0   1       newNum: 432*10+1 =4321
        int newNum=0;


        while (true) {
            if (num > 0) {
                break;
            }
            newNum = newNum * 10 + num % 10;
            num = num / 10;
        }
        
        
        return newNum;


        //5 5 5 5 5 比5此  去除不可能得到前三名的马   5
        //3 3 3 3 3 拿出第一名跑 去除第一名的最后两个的队     1
        //3 3 3 
        //

    }
}
