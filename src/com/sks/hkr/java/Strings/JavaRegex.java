package com.sks.hkr.java.Strings;

import java.util.Scanner;

public class JavaRegex {

    //String pattern="(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)";


    static String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    static String pattern = num + "." + num + "." + num + "." + num;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(pattern));
        }

    }
}