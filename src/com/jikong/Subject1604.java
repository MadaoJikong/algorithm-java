package com.jikong;

/**
 * @author chengjunchao
 * @title: Subject1604
 * @projectName algorithm-java
 * @description: 面试题 16.04. 井字游戏
 * @date 2021/1/12 10:41
 */
public class Subject1604 {
    public String tictactoe(String[] board) {
        //平局 Draw， 还有行动Pending ，谁胜返回谁
        //空白
        boolean space = false;
        //赢
        char win = '0';
        //判断空白
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board[j].length(); i++) {
                if (board[j].charAt(i) == ' ') {
                    space = true;
                }
            }
        }
        //判断横的有没有赢
        for (int j = 0; j < board.length; j++) {
            char hFirst = board[j].charAt(0);
            win = board[j].charAt(0);
            if (win == ' ') {
                continue;
            }
            for (int i = 0; i < board[j].length(); i++) {
                if (board[j].charAt(i) != hFirst) {
                    win = '0';
                }
            }
            if (win != '0') {
                return win + "";
            }
        }
        //判断竖的有没有赢
        for (int i = 0; i < board[0].length(); i++) {
            char sFirst = board[0].charAt(i);
            win = board[0].charAt(i);
            if (win == ' ') {
                continue;
            }
            for (int j = 0; j < board.length; j++) {
                if (board[j].charAt(i) != sFirst) {
                    win = '0';
                }
            }
            if (win != '0') {
                return win + "";
            }
        }
        //判断右下有没有赢
        char a = board[0].charAt(0);
        win = board[0].charAt(0);
        if (win != ' ') {
            for (int j = 0; j < board.length; j++) {
                if (a != board[j].charAt(j)) {
                    win = '0';
                }
            }
            if (win != '0') {
                return win + "";
            }
        }
        //判断右上有没有赢
        char b = board[board.length - 1].charAt(0);
        win = board[board.length - 1].charAt(0);
        if (win != ' ') {
            for (int i = 0; i < board.length; i++) {
                if (b != board[board.length - 1 - i].charAt(i)) {
                    win = '0';
                }
            }
            if (win != '0') {
                return win + "";
            }
        }
        if (space) {
            return "Pending";
        }
        return "Draw";
    }

    public static void main(String[] args) {
        Subject1604 subject1604 = new Subject1604();
        String[] board = new String[]{"                             ", "                     O       ", "         X           X       ", "                             ", "                             ", "                             ", "                             ", "                             ", "                             ", "                             ", "                             ", "                             ", "                             ", "                             ", "                             ", "                             ", "                      O      ", "                             ", "                             ", "                             ", "                             ", "                             ", "                             ", "      X                      ", "                             ", "                             ", "      O                      ", "                             ", "                             "};
        String result = subject1604.tictactoe(board);
        System.out.println(result);
    }
}
