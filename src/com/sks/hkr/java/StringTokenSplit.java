package com.sks.hkr.java;

import java.util.*;

public class StringTokenSplit {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //String[] terms = s.split("[^a-zA-Z]+");
        // Arrays.stream(terms).forEach(System.out::println);
        String[] a = s.trim().split("[ !,?\\._'@]+", 0);
        if (a.length == 1 && a[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(a.length);
            Arrays.stream(a).forEach(System.out::println);
        }
        scan.close();
    }


}
