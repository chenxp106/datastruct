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
        boolean [][] marked = new boolean[rows][cols];
        char[][] matri = build(matrix);
        for (int i = 0;i < rows;i++){
            for (int j = 0;j < cols;j++){
                if (backtracking(matri,str,marked,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtracking(char[][] matrix, char[] str, boolean[][] marked, int pathLen, int r, int c){
        if (pathLen == str.length){
            return true;
        }
        if (r < 0 || r >= rows || c < 0 || c>= cols || matrix[r][c] != str[pathLen] || marked[r][c]){
            return false;
        }
        marked[r][c] = true;
        for (int [] n : next){
            if (backtracking(matrix, str, marked, pathLen+1, r+n[0],c+n[1])){
                return true;
            }
        }
        marked[r][c] = false;
        return false;
    }

    private char[][] build(char[] array){
        int idx = 0;
        char[][] matrix = new char[rows][cols];
        for (int r = 0;r<rows;r++){
            for (int c = 0;c < cols;c++){
                matrix[r][c] = array[idx++];
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        char[] matrx = {'A','B','C','E','S','F','C','S','A','D','E','E'};
        int row = 3;
        int col = 4;
        char[] path = {'A','B','C','C'};
        Test12 test12 = new Test12();
        System.out.println(test12.hasPath(matrx,row,col,path));
    }
}
