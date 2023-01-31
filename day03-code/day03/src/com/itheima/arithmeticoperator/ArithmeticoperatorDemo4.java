package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo4 {
    public static void main(String[] args) {
        char c = 'a';
        int result = c + 0;
        //当 字符 + 字符 或者 字符 + 数字 时,
        //会把字符通过ASC LL码表查询到对应的数字再进行计算.
        System.out.println(result);//97
    }
}
