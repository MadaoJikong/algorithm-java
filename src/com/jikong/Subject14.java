package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject14
 * @projectName algorithm-java
 * @description: 14. 最长公共前缀
 * @date 2020/10/10 16:46
 */
public class Subject14 {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return result;
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int sub = 0;
        while (true) {
            if (strs[0].length() == 0 || strs[0].length() < sub + 1) {
                return result;
            }
            char pre = strs[0].charAt(sub);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() < sub + 1) {
                    return result;
                }
                char n = strs[i].charAt(sub);
                if (pre != n) {
                    return result;
                }
                if (i + 1 == strs.length) {
                    result = result + n;
                    sub++;
                }
            }
        }
    }

    public static void main(String[] args) {
        //"dog","racecar","car"     "flower", "flow", "flight"   "flower","flower","flower","flower"
        String[] strs = new String[]{"flower", "flower", "flower", "flower"};
        Subject14 subject14 = new Subject14();
        System.out.println(subject14.longestCommonPrefix(strs));
    }
}
