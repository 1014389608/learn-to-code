package com.itheima.test;

public class Test18 {
    public static void main(String[] args) {
        /*需求:给你一个整数x。
        如果×是一个回文整数，打印true ，否则，返回 false 。
        解释:回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        例如，121是回文，而123 不是。*/

        //思路:把数字倒过来跟原来的数字进行比较

        int x = 121;
        int temp = x;
        int num = 0;
        while (x != 0){
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println(num);
        System.out.println(x);
        System.out.println(num == temp);

    }
}
