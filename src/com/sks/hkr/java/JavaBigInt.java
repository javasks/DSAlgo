package com.sks.hkr.java;


import java.util.*;
import java.math.*;

public class JavaBigInt {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BigInteger i = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        System.out.println(i.add(b));
        System.out.println(i.multiply(b));
        in.close();
    }

}
