package com.itheima.test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        /*需求:键盘录入星期数,输出工作日、休息日.
        (1-5)工作日,(6-7)休息日.*/

        //分析:
        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期");
        int week = sc.nextInt();

        //2.利用switch语句来进行选择
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }

        //利用JDK12简化代码书写
        switch (week){
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }
    }
}
