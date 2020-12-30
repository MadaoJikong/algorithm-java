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
        int[] next = new int[needle.length()];
        //先组装 next
        int j = 0;
        for (int i = 2; i < needle.length(); i++) {
            while (j != 0 && needle.charAt(j) != needle.charAt(i - 1)) {
                //从next[i+1]的求解回溯到 next[j]
                j = next[j];
            }
            if (needle.charAt(j) == needle.charAt(i - 1)) {
                j++;
            }
            next[i] = j;
        }
        j = 0;
        //主循环，遍历主串字符
        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                //遇到坏字符时，查询next数组并改变模式串的起点
                j = next[j];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                //匹配成功，返回下标
                return i - needle.length() + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //haystack = "hello", needle = "ll" 2 , haystack = "aaaaa", needle = "bba" -1
        String haystack = "hello", needle = "ll";
        Subject28 subject28 = new Subject28();
        System.out.println(subject28.strStr(haystack, needle));
    }
}
