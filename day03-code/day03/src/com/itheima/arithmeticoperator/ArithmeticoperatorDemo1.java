package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2);//5
        // -
        System.out.println(5 - 1);//4
        // *
        System.out.println(7 * 9);//63

        //如果计算中有小数参与计算，
        //结论：
        //在代码中，如果有小数参与计算，结果是有可能(有可能)不精确的，
        //具体原因，我们到了JavaSE的时候，会再详细的讲解。
        System.out.println(1.1 + 1.1);
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
    }
}
