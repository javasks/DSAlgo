package com.sks.hkr;

import java.util.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int count=1;
        while(scanner.hasNext() ){
            System.out.println(count +" " +scanner.nextLine());
            count++;
        }

    }
}