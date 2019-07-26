package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.List;

public class Test417 {

    private int m,n;
    private int[][] direction = {{0,1},{0,-1},{-1,0},{1,0}};
    private int[][] matrix;

    public List<List<Integer>> pacificAtlantic(int[][] matrix){

        if (matrix == null || matrix.length == 0){
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        m = matrix.length;
        n = matrix[0].length;

        this.matrix = matrix;

        boolean[][] canReachP = new boolean[m][n];
        boolean[][] canReachA = new boolean[m][n];

        for (int i = 0;i<m;i++){
            dfs(canReachP,i,0);
            dfs(canReachA,i,n-1);
        }
        for (int j = 0;j<n;j++){
            dfs(canReachP,0,j);
            dfs(canReachA,m-1,j);
        }
        for (int i = 0;i<m;i++){
            for (int j = 0;i<n;j++){
                if (canReachA[i][j] && canReachP[i][j]){
                    List<Integer> a = new ArrayList<>();
                    a.add(i);
                    a.add(j);
                    res.add(a);
                }
            }
        }
        return res;
    }

    private void dfs(boolean[][] canReach,int r,int c){
        if (canReach[r][c])
            return;
        canReach[r][c] = true;
        for (int d[]:direction){
            int nextR = r+d[0];
            int nextC = c + d[1];
            if (nextR<0 || nextR >= m || nextC < 0 ||nextC >=n || matrix[r][c]>matrix[nextR][nextC]){
                continue;
            }
            dfs(canReach,nextR,nextC);
        }
    }
}
