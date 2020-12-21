package com.jikong.alg.dfs.queens;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chengjunchao
 * @title: Queens
 * @projectName algorithm-java
 * @description: N皇后
 * @date 2020/12/21 15:45
 */
public class Queens {
    public static void main(String[] args) {
        Queens q = new Queens();
        List<List<String>> list = q.solveNQueens(7);
        System.out.println(list);
    }

    List<List<String>> res = new ArrayList<>();

    /**
     * 输入边长 返回所有的合法放置
     *
     * @param n
     * @return
     */
    List<List<String>> solveNQueens(int n) {
        //'.' 表示空，'Q' 表示皇后，初始化空棋盘。
        String[][] board = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = ".";
            }
        }
        backtrack(board, 0);
        return res;
    }

    public void backtrack(String[][] board, int row) {
        //触发结束条件
        if (row == board.length) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                String newRow = "";
                for (int j = 0; j < board[i].length; j++) {
                    newRow += board[i][j];
                }
                list.add(newRow);
            }
            res.add(list);
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            //排掉不合法的
            if (!isValid(board, row, col)) {
                continue;
            }
            //做选择
            board[row][col] = "Q";
            backtrack(board, row + 1);
            //撤销选择
            board[row][col] = ".";
        }
    }

    public boolean isValid(String[][] board, int row, int col) {
        int n = board.length;
        // 检查列是否有皇后互相冲突
        for (int i = 0; i < n; i++) {
            if (board[i][col] == "Q") {
                return false;
            }
        }
        // 检查右上方是否有皇后互相冲突
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == "Q") {
                return false;
            }
        }
        // 检查左上方是否有皇后互相冲突
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == "Q") {
                return false;
            }
        }
        return true;
    }
}
