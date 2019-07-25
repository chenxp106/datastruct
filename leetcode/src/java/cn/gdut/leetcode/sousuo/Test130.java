package cn.gdut.leetcode.sousuo;

public class Test130 {

    private int m,n;

    private int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

    public void solve(char[][] board){
        if (board == null || board.length == 0){
            return;
        }
        m = board.length;
        n = board[0].length;
        // 将第一列和第四列处理
        for (int i = 0;i<m;i++){
            dfs(board,i,0);
            dfs(board,i,n-1);
        }
        // 处理第一行和第四行
        for (int j = 0;j<n;j++){
            dfs(board,0,j);
            dfs(board,m-1,j);
        }
        // 在将O换成X，将#换成O
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if (board[i][j] == '#'){
                    board[i][j] = 'O';
                }
                else if (board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

    }

    private void dfs(char[][] borad,int r,int c){
        if (r<0 || r>= m || c<0 || c>= n || borad[r][c] == 'X'){
            return;
        }
        // 标记访问过
        borad[r][c] = '#';
        // 进行感染
        for (int d[] : directions){
            dfs(borad,r+d[0],c+d[1]);
        }
    }
}
