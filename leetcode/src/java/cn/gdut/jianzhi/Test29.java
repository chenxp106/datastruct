package cn.gdut.jianzhi;

import java.util.ArrayList;

public class Test29 {
    public ArrayList<Integer> printMatrix(int [][] matrix){
        ArrayList<Integer> ret = new ArrayList<>();
        int row = matrix.length - 1;
        int colw = matrix[0].length - 1;
        int r1 = 0, r2 = row ;
        int c1 = 0, c2 = colw ;
        while (r1 <= r2 && c1 <= c2){
            for (int i = c1 ; i<= c2;i++){
                ret.add(matrix[r1][i]);
            }
            for (int i = r1 + 1;i <= r2; i++){
                ret.add(matrix[i][c2]);
            }
            if (r1 != r2){
                for (int i = c2 - 1; i>=c1;i--){
                    ret.add(matrix[r2][i]);
                }
            }
            if (c1 != c2){
                for (int i = r2 - 1;i> r1;i--){
                    ret.add(matrix[i][c1]);
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ret;
    }
}
