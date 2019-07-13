package cn.gdut.leetcode.dongtai;

public class Test64 {
    public int minPath(int[][] grid){
        if (grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int[][] arr = grid;
        int m = grid.length;
        int n = grid[0].length;
        //计算第一行
        for (int i  = 1;i<n;i++){
            arr[0][i] = grid[0][i]+arr[0][i-1];
        }
        //计算第一列
        for (int j = 1;j<m;j++){
            arr[j][0] = grid[j][0] + arr[j-1][0];
        }

        //计算剩余的值
        for (int i = 1;i<m;i++){
            for (int j = 1;j<n;j++){
                arr[i][j] = Math.min(arr[i-1][j]+grid[i][j],grid[i][j]+arr[i][j-1]);
            }
        }
        return arr[m-1][n-1];
    }
}
