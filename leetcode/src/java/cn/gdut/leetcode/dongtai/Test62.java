package cn.gdut.leetcode.dongtai;

public class Test62 {
    public int uniquePaths(int m,int n){
        int[][] graph = new int[n][m];
        //处理第一行和第一列
        for (int i = 0;i<m;i++){
            graph[0][i] = 1;
        }
        for (int i = 0;i < n;i++){
            graph[i][0] = 1;
        }
        //处理剩余的
        for (int i = 1;i < n;i++){
            for (int j = 1; j< m;j++){
                graph[i][j] = graph[i-1][j]+graph[i][j-1];
            }
        }
        return graph[n-1][m-1];
    }

    public static void main(String[] args) {
        Test62 test62 = new Test62();
        int a = test62.uniquePaths(3,2);
        System.out.println(a);
    }
}
