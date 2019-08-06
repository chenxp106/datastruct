package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test51 {

    /*private List<List<String>> solutions;
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
    }*/

    private List<List<String>> solution;
    private char[][] nQueen;
    private boolean[] arr45Used;
    private boolean[] arr135Used;
    private int n;
    private boolean[] colUsed;

    public List<List<String>> solveNQuenes(int n){
        solution = new ArrayList<>();
        nQueen =new  char[n][n];
        // 构建一个围棋
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                nQueen[i][j] = '.';
            }
        }

        colUsed = new boolean[n];
        arr45Used = new boolean[2 * n -1];
        arr135Used = new boolean[2 * n -1];
        this.n = n;
        // 初始化赋值
        tracking(0);
        return solution;
    }

    private void tracking(int row){

        if (row == n){
            List<String> list = new ArrayList<>();
            for (char[] chars : nQueen){
                list.add(new String(chars));
            }
            solution.add(list);
            return;
        }
        // 循环每一列
        for (int col = 0;col<n;col++){
            int arr45Idx = row + col;
            int arr135Idx = n - 1 - (row - col);
            if (arr45Used[arr45Idx] || arr135Used[arr135Idx] || colUsed[col]){
                continue;
            }
            nQueen[row][col] = 'Q';
            arr45Used[arr45Idx] = arr135Used[arr135Idx] = colUsed[col] = true;
            tracking(row+1);
            arr45Used[arr45Idx] = arr135Used[arr135Idx] = colUsed[col] = false;
            nQueen[row][col] = '.';
        }
    }
}
