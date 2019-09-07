package cn.gdut.jianzhi;

public class Test12 {

    private final static int[][] next = {{0,-1},{0,1},{-1,0},{1,0}};
    private int rows;
    private int cols;
    public boolean hasPath(char[] matrix, int rows, int cols, char [] str){
        if (rows == 0 || cols == 0){
            return false;
        }
        this.rows = rows;
        this.cols = cols;
        char[][] matrx = build(matrix, rows, cols);
        boolean [][] marked = new boolean[rows][cols];
        for (int i = 0; i < rows;i++){
            for (int j = 0; j < cols;j++){
                if (backtracking(matrx,0,i,j,marked,str)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtracking(char[][] matrix, int pathLen, int r, int c,boolean[][] marked, char[] str){
        if (str.length == pathLen){
            return true;
        }
        if (r < 0 || r >= rows || c < 0 || c >= cols || matrix[r][c] != str[pathLen] || marked[r][c]){
            return false;
        }
        // 标记访问过
        marked[r][c] = true;
        for (int [] x : next){
            if (backtracking(matrix,pathLen + 1,r + x[0], c + x[1],marked,str))
                return true;
        }
        marked[r][c] = false;
        return false;
    }

    private char[][] build(char[] array, int rows, int cols){
        int idx = 0;
        char[][] matri = new char[rows][cols];
        for (int i = 0;i < rows ;i++){
            for (int j = 0 ;j < cols;j++){
                matri[i][j] = array[idx++];
            }
        }
        return matri;
    }



    public static void main(String[] args) {
        char[] matrx = {'A','B','C','E','S','F','C','S','A','D','E','E'};
        int row = 3;
        int col = 4;
        char[] path = {'A','B','C','C'};
        Test12 test12 = new Test12();
//        System.out.println(test12.build(matrx,row,col));
        System.out.println(test12.hasPath(matrx,row,col,path));
    }
}
