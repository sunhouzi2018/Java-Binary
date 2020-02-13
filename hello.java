package com.qd.demo01;

import java.util.Scanner;

public class hello {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入十进制数字：");
        int shi = in.nextInt();
        String str = "";
        while (shi != 0){
            str = String.valueOf(shi%2) + str;
            shi = shi / 2;
        }
        System.out.println("二进制结果为：" + str);
        System.out.print("请输入二进制数字：");
        str = in.next();
        int bei = 1;
        shi = 0;
        for (int i = str.length()-1; i >= 0; i--){
            shi += Integer.parseInt(String.valueOf(str.charAt(i))) * bei;
            bei *= 2;
        }
        System.out.println("十进制数字为：" + shi);
    }
}
