package com.sks.hkr.java.bigNumber;

import java.util.Scanner;


public class JavaPrimality {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /**
         * Other approach

         BigInteger bigInt=scanner.nextBigInteger();
         System.out.println(bigInt.isProbablePrime(100) ? "prime" : "not prime");
         scanner.close();
         */


        String num = scanner.nextLine();
        int n = Integer.parseInt(num);
        boolean flag = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("prime");
        else
            System.out.println(" is not a prime number.");
        scanner.close();
    }

}

