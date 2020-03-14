package com.sks.hkr.java;

import java.util.*;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char ch[]=A.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        if(A.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}




