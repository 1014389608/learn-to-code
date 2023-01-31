package com.itheima.switchdemo;

/*
    default的位置和省略         case穿透

    1.位置 : default不一定是写在最下面的,我们可以写在任意位置。只不过习惯会写在最下面.
    2.省略 : default可以省略,语法不会有问题,但是不建议省略.

    case穿透:break打漏的话就会执行所有输出语句,意为case穿透
             就是语句体当中没有写break导致的
             执行流程:
                首先还是会拿着小括号中表达式的值跟下面每一个case进行匹配.
                如果匹配上了,就会执行对应的语句体,如果此时发现了break,那么结束整个switch语句.
                如果没有发现break那么程序会继续执行下一个case的语句体，一直遇到break或者右大括号为止.
     case穿透使用场景:
        如果多个case的语句体重复了,那么我们考虑利用case穿透去简化代码.
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        int number = 1;
        switch (number){
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                break;
            case 20:
                System.out.println("number的值为20");
                break;
            default:
                System.out.println("number的值不是1,10或者20");
                break;
        }
    }
}
