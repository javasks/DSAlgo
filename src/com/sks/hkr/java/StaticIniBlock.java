package com.sks.hkr.java;


import java.util.Scanner;

public class StaticIniBlock {

    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner cin = new Scanner(System.in);
        B = cin.nextInt();
        H = cin.nextInt();
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }

}

