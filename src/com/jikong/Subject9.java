package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject9
 * @projectName algorithm-java
 * @description: 9、回文数
 * @date 2020/10/10 14:08
 */
public class Subject9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return false;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return false;
            }
            rev = rev * 10 + pop;
        }
        if (rev == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x = 1212;
        Subject9 subject9 = new Subject9();
        System.out.println(subject9.isPalindrome(x));
    }
}
