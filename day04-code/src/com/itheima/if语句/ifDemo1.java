package com.itheima.if语句;

import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
        //键盘录入女婿酒量,如果大于2斤,老丈人给出回应,反之不回应

        //if格式
        //if(关系表达式)
            //语体句;
        // }


        //分析:
        //1.键盘录入女婿的酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int wine = sc.nextInt();
        //2.对酒量进行判断
        if (wine > 2){
            System.out.println("小伙子,不错呦!!");
        }
    }
}
