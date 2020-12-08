package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject28
 * @projectName algorithm-java
 * @description: 28. 实现 strStr()
 * @date 2020/10/15 13:43
 */
public class Subject28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int m = haystack.length();
        int n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //haystack = "hello", needle = "ll" 2 , haystack = "aaaaa", needle = "bba" -1
        String haystack = "aa", needle = "aaa";
        Subject28 subject28 = new Subject28();
        System.out.println(subject28.strStr(haystack, needle));
    }
}
