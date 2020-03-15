package com.sks.hkr.java.introduction;

import java.util.Scanner;

public class LoopsI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            int sum = i * N;
            System.out.println(N + " x " + i + " = " + sum);
        }
    }
}
