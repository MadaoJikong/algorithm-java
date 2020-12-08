package com.jikong;

import java.util.*;

/**
 * @author chengjunchao
 * @title: Subject20
 * @projectName algorithm-java
 * @description: 20、有效的括号
 * @date 2020/10/10 17:47
 */
public class Subject20 {
    Map<Character, Character> getValue() {
        Map<Character, Character> hash = new HashMap<>(16);
        hash.put(')', '(');
        hash.put(']', '[');
        hash.put('}', '{');
        return hash;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        List<Character> left = new ArrayList<>();
        left.add('(');
        left.add('[');
        left.add('{');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (left.contains(c)) {
                stack.push(c);
            } else {
                if (!stack.empty()) {
                    char old = stack.peek();
                    if (getValue().get(c).equals(old)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // ([)]    {[]}   ()[]{}  (] () []  ]()  ([]
        String s = "([]";
        Subject20 subject20 = new Subject20();
        System.out.println(subject20.isValid(s));
    }
}
