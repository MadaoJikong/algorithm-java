package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject13
 * @projectName algorithm-java
 * @description: 13、 罗马数字转整数
 * @date 2020/10/10 15:14
 */
public class Subject13 {
    int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        int preNum = getValue(s.charAt(0));
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if (preNum >= num) {
                sum = sum + preNum;
            } else {
                sum = sum - preNum;
            }
            preNum = num;
        }
        sum = sum + preNum;
        return sum;
    }

    public static void main(String[] args) {
        // IV  III
        String s = "IV";
        Subject13 subject13 = new Subject13();
        System.out.println(subject13.romanToInt(s));
    }
}
