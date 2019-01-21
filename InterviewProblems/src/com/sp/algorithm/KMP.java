package com.sp.algorithm;

public class KMP {
    private static int[] computeLPS(char[] pattern) {
        int[] lps = new int[pattern.length];
        int index = 0;
        for (int i = 1; i < pattern.length; ) {
            if (pattern[i] == pattern[index]) {
                lps[i] = index + 1;
                index++;
                i++;
            } else if (index != 0) {
                index = lps[index - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
        return lps;
    }

    public static boolean isSubString(char[] text, char[] pattern) {
        if (pattern.length > text.length)
            return false;

        if (text.length == 0 || pattern.length == 0)
            return false;

        int[] lps = computeLPS(pattern);
        int i = 0;
        int j = 0;
        while (i < text.length && j < pattern.length) {
            if (text[i] == pattern[j]) {
                i++;
                j++;
            } else if (j != 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
        if (j == pattern.length)
            return true;
        return false;
    }

    public static boolean isSubString(String text, String pattern) {
        return isSubString(text.toCharArray(), pattern.toCharArray());
    }

    public static int getSubstringIndex(String text, String pattern) {
        return getSubStringIndex(text.toCharArray(), pattern.toCharArray());
    }

    public static int getSubStringIndex(char[] text, char[] pattern) {
        if (pattern.length > text.length)
            return 0;

        if (text.length == 0 || pattern.length == 0)
            return 0;

        int[] lsp = computeLPS(pattern);
        int index=-1;
        int j = 0;  // Number of chars matched in pattern
        for (int i = 0; i < text.length; i++) {
            while (j > 0 && text[i] != pattern[j]) {
                // Fall back in the pattern
                j = lsp[j - 1];  // Strictly decreasing
            }
            if (text[i] == pattern[j]) {
                // Next char matched, increment position
                j++;
                if (j == pattern.length)
                    index= i - (j - 1);
            }
        }

        return index;
    }

    public static void main(String[] args) {
        String text = "abcxabcdabcdabcy";
        String pattern = "abcdabcy";
        System.out.print(KMP.isSubString(text, pattern)+" ");
        System.out.println(KMP.getSubstringIndex(text, pattern));
        System.out.println(text.substring(KMP.getSubstringIndex(text,pattern)));
    }
}
