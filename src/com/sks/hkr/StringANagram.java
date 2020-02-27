package com.sks.hkr;

import java.util.Arrays;
import java.util.Scanner;

public class StringANagram {


    static boolean isAnagram(String a, String b) {
        // Complete the function

        a=a.toLowerCase();
        b=b.toLowerCase();
        boolean f = false;
        char[] c = a.toCharArray();
        Arrays.sort(c);
        char[] d = b.toCharArray();
        Arrays.sort(d);
        String e = new String (c);
        String g = new String (d);
        if (e.equals(g)) {
            f=true;
        }
        return f;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}