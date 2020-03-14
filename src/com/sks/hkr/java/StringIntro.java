package com.sks.hkr.java;

import java.util.*;

public class StringIntro {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Sum lengths */
        System.out.println(A.length() + B.length());

        /* Compare lexicographical ordering */
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        /* Print the Strings in desired format */
        System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));
    }

    private static String capFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        } else {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
    }

    /*public static int stringCompare(String str1,
                                    String str2)
    {
        for (int i = 0; i < str1.length() &&
                i < str2.length(); i++) {
            if ((int)str1.charAt(i) ==
                    (int)str2.charAt(i)) {
                continue;
            }
            else {
                return (int)str1.charAt(i) -
                        (int)str2.charAt(i);
            }
        }

        // Edge case for strings like
        // String 1="Geeky" and String 2="Geekyguy"
        if (str1.length() < str2.length()) {
            return (str1.length()-str2.length());
        }
        else if (str1.length() > str2.length()) {
            return (str1.length()-str2.length());
        }

        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }
*/

}




