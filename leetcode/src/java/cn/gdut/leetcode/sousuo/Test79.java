package cn.gdut.leetcode.sousuo;

public class Test79 {
    private final static int [][] derection = {{1,0},{-1,0},{0,1},{0,-1}};

    private int m;
    private int n;

    public boolean exist(char[][] board,String word){

        // 判断word为空
        if (word == null || word.length() == 0){
            return true;
        }
        // 判断board
        if (board == null || board.length == 0){
            return false;
        }
        m  = board.length;
        n = board[0].length;
        boolean[][] visites = new boolean[m][n];

        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if (backtracking(0,i,j,visites,board,word)){
                    return true;
                }
            }
        }
        return false;

    }

    private boolean backtracking(int curLen,int r,int c,boolean[][] visited,final char[][] board,final String word){
        if (curLen == word.length()){
            return true;
        }
        if (r<0 ||r>= m|| c <0 ||c>=n || board[r][c] != word.charAt(curLen) || visited[r][c]){
            return false;
        }
        // 标记为true
        visited[r][c] = true;
        // 感染
        for (int d[] : derection){
            if (backtracking(curLen +1,r+d[0],c+d[1],visited,board,word)){
                return true;
            }
        }
        // 重新标记未访问
        visited[r][c] = false;
        return false;
    }
}
