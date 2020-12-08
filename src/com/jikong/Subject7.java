package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject7
 * @projectName algorithm-java
 * @description: 7、整数反转
 * @date 2020/10/10 11:31
 */
public class Subject7 {
    /**
     * @param x
     * @return
     */
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        // 0   123  321  -123
        int x = 0;
        Subject7 subject7 = new Subject7();
        System.out.println(subject7.reverse(x));
    }
}
