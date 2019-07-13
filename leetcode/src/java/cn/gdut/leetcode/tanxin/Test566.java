package cn.gdut.leetcode.tanxin;

public class Test566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        /*int row = nums.length;
        int colow = nums[0].length;
        if (row * colow != r * c){
            return nums;
        }
        int k = 0;
        int[] s = new int[row*colow];
        for (int i = 0;i<row;i++){
            for (int j = 0;j<colow;j++){
                s[k++]=nums[i][j];
            }
        }
        int m = 0;
        //重塑
        int[][] res = new int[r][c];
        for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                res[i][j] = s[m++];
            }
        }
        return res;*/
        int m = nums.length;
        int n = nums[0].length;
        if (m * n != r * c){
            return nums;
        }
        int index = 0;
        int[][] res = new int[r][c];
        for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                res[i][j] = nums[index/n][index%n];
                index++;
            }
        }
        return res;
    }
}
