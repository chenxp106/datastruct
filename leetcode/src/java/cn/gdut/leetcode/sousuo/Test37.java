package cn.gdut.leetcode.sousuo;

public class Test37 {

    private boolean[][] rowsUsed = new boolean[9][10];
    private boolean[][] colsUsed = new boolean[9][10];
    private boolean[][] cubesUsed = new boolean[9][10];
    private char[][] board;

    public void sovleSudoku(char[][] board){
        this.board = board;
        for (int i = 0; i < 9; i++){
            for (int j = 0;j < 9;j++){
                // 如果是空的数，则直接返回
                if (board[i][j] == '.'){
                    continue;
                }
                // 否则，记录这个数的值
                int num = board[i][j] - '0';
                // 记录第i行用过num这个数
                rowsUsed[i][num] = true;
                colsUsed[j][num] = true;
                // 记录第几个九宫格用过这个数
                cubesUsed[cubeNum(i, j)][num] = true;
            }
            tracking(0,0);
        }
    }

    private boolean tracking( int row, int col){
        while (row < 9 && board[row][col] != '.'){
            row = col == 8 ? row + 1 : row;
            col = col == 8 ? 0 : col + 1;
        }
        if (row == 9){
            return true;
        }
        for (int num = 1;num <= 9;num++){
            // 如果用过了，则直接跳过
            if (rowsUsed[row][num] || colsUsed[col][num] || cubesUsed[cubeNum(row,col)][num]){
                continue;
            }
            // 否则，标记使用过
            rowsUsed[row][num] = colsUsed[col][num] = cubesUsed[cubeNum(row,col)][num] = true;
            // 将这个数填入表格中
            board[row][col] = (char) (num + '0');
            if (tracking(row, col)){
                return true;
            }
            // 将表格中的数重新标记
            board[row][col] = '.';
            rowsUsed[row][num] = colsUsed[col][num] = cubesUsed[cubeNum(row,col)][num] = false;
        }
        return false;
    }

    private int cubeNum(int i,int j){
        int r  = i / 3;
        int c = j / 3;
        return  r * 3 + c;
    }


}
