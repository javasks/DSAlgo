package com.sks.hkr;

import java.util.Arrays;
import java.util.Scanner;

public class StringANagram {

//Method1
    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean f = false;
        char[] c = a.toCharArray();
        Arrays.sort(c);
        char[] d = b.toCharArray();
        Arrays.sort(d);
        String e = new String(c);
        String g = new String(d);
        if (e.equals(g)) {
            f = true;
        }
        return f;
    }

    //method 2
    static boolean isAnagrams(String word, String anagram) {
        word = word.toLowerCase();
        anagram = anagram.toLowerCase();
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagrams(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}