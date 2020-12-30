package com.jikong.alg.kmp;

/**
 * @author chengjunchao
 * @title: Kmp
 * @projectName algorithm-java
 * @description: kmp算法 匹配字符
 * @date 2020/12/30 10:51
 */
public class Kmp {
    public static void main(String[] args) {
        // hello  ll  aaacaaab  aaab   GTGTGAGCTGGTGTGTGCFAA   GTGTGCF
        String txt = "GTGTGAGCTGGTGTGTGCFAA";
        String pat = "GTGTGCF";
        Kmp kmp = new Kmp();
        System.out.println(kmp.search(txt, pat));

        System.out.println(kmp.allSearch(txt, pat));
    }

    int search(String haystack, String needle) {
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

    int allSearch(String txt, String pat) {
        if (pat.length() == 0) {
            return 0;
        }
        for (int i = 0; i < txt.length(); i++) {
            int m = i;
            for (int j = 0; j < pat.length(); j++) {
                if (txt.charAt(m) != pat.charAt(j)) {
                    break;
                }
                if (j == pat.length() - 1) {
                    return i;
                }
                m++;
                if (m >= txt.length()) {
                    return -1;
                }
            }
        }
        return -1;
    }
}
