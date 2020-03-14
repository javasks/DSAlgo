package com.sks.hkr;

import java.util.Scanner;

class UsernameValidator {
    /**
     * one character starting from A to Z/a to z
     * After that 7 to 29 characters from A to Z/a to z/0 to 9/_
     */
    public static final String regularExpression = "[A-Za-z]{1}[A-Za-z0-9_]{7,29}";


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

    }
}