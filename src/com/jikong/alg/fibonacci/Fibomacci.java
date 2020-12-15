package com.jikong.alg.fibonacci;

/**
 * @author chengjunchao
 * @title: fibomacci
 * @projectName algorithm-java
 * @description: 斐波那契
 * @date 2020/12/11 11:19
 */
public class Fibomacci {
    public static void main(String[] args) {
        Fibomacci fibomacci = new Fibomacci();
//        int result = fibomacci.fib1(48);
//        System.out.println(result);

        int result = fibomacci.fib2(48);
        System.out.println(result);
    }

    /**
     * 递归的斐波那契
     *
     * @param n
     * @return
     */
    public int fib1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int result = fib1(n - 1) + fib1(n - 2);
        return result;
    }

    /**
     * 带备忘录
     *
     * @param n
     * @return
     */
    public int fib2(int n) {
        int[] memento = new int[n + 1];
        return fib2Loop(memento, n);
    }

    private int fib2Loop(int[] memento, int n) {
        if (n == 1 || n == 2) {
            if (memento[n] != 0) {
                return memento[n];
            }
            memento[n] = 1;
            return 1;
        }
        int f1 = 0, f2 = 0;
        if (memento[n - 1] != 0) {
            f1 = memento[n - 1];
        } else {
            f1 = fib2Loop(memento, n - 1);
            memento[n - 1] = f1;
        }
        if (memento[n - 2] != 0) {
            f2 = memento[n - 2];
        } else {
            f2 = fib2Loop(memento, n - 2);
            memento[n - 2] = f2;
        }
        return f1 + f2;
    }
}
