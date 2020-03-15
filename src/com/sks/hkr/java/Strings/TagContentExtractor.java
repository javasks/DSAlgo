package com.sks.hkr.java.Strings;

import java.util.Scanner;

public class TagContentExtractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String line = in.nextLine();
            int current = 0;
            boolean none = true;

            for (; ; ) {
                /**
                 * @param   "<"      the substring to search for.
                 *  current:   fromIndex   the index from which to start the search.
                 *  @return  the index of the first occurrence of the specified substring,
                 *  starting at the specified index,
                 */
                int startIndex = line.indexOf("<", current);
                if (startIndex < 0) break;
                int endIndex = line.indexOf(">", startIndex);
                if (endIndex < 0) break;
                String tag = line.substring(startIndex + 1, endIndex);
                if (tag.length() == 0 || tag.charAt(0) == '/') {
                    current = endIndex + 1;
                    continue;
                }
                int bk = line.indexOf("</" + tag + ">");
                if (bk >= 0) {
                    String candidate = line.substring(endIndex + 1, bk);
                    if (candidate.length() > 0 && candidate.indexOf("<") < 0) {
                        none = false;
                        System.out.println(candidate);
                    }
                }
                current = endIndex + 1;
            }
            if (none) System.out.println("None");

            testCases--;
        }
    }
}




