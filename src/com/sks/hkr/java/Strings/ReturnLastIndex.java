package com.sks.hkr.java.Strings;

/**
 * Return Last index of given character in given string
 * If not present return -1
 */

class ReturnLastIndex {

    static int findLastIndex(String str, Character x) {
        int index = -1;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == x)
                index = i;
        return index;
    }

    public static void main(String[] args) {

        /**
         * String in which char is to be found
         */
        String str = "sksjavasks";

        /**
         * char whose index is to be found
         */
        Character x = 's';

        int index = findLastIndex(str, x);
        if (index == -1)
            System.out.println("Character not found");
        else
            System.out.println("Last index is " + index);
    }
}


