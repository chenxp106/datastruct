package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test51 {

    private List<List<String>> solutions;
    private char[][] nQueens;
    private boolean[] colUsed;
    private boolean[] diagonals45Used;
    private boolean[] diagonal135Used;
    private int n;

    public List<List<String>> solveQueens(int n){
        solutions = new ArrayList<>();
        nQueens = new char[n][n];
        // 构造表格
        for (int i = 0;i<n;i++){
            Arrays.fill(nQueens[i], '.');
        }
        colUsed = new boolean[n];
        diagonal135Used = new boolean[2 * n -1];
        diagonals45Used = new boolean[2 * n -1];
        this.n = n;

        tracking(0);
        return solutions;
    }

    private void tracking(int row){
        // 递归出口
        if (row == n){
            List<String> list = new ArrayList<>();
            for (char[] chars : nQueens){
                list.add(new String(chars));
            }
            solutions.add(list);
            return;
        }

        // 放了行，再放列
        for (int col = 0;col < n;col++){
            int diagonals45Idx = row + col;
            int diagonals135Idx = n - 1 +(row - col);
            if (colUsed[col] || diagonals45Used[diagonals45Idx] || diagonal135Used[diagonals135Idx]){
                continue;
            }
            // 放入一个Q
            nQueens[row][col] = 'Q';
            colUsed[col] = diagonal135Used[diagonals135Idx] = diagonals45Used[diagonals45Idx] = true;
            // 递归
            tracking(row + 1);
            // 标记为false
            colUsed[col] = diagonal135Used[diagonals135Idx] = diagonals45Used[diagonals45Idx] = false;
            // 重新标记
            nQueens[row][col] = '.';
        }
    }
}
