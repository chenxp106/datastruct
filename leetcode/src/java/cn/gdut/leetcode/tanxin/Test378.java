package cn.gdut.leetcode.tanxin;

public class Test378 {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = matrix[0][0];
        int hi = matrix[m-1][n-1];
        //二分查找
        while (lo<hi){
            int mid = lo + (hi - lo)/2;
            int cnt = 0;
            for (int i = 0;i<m;i++){
                for (int j = 0;j<n&& matrix[i][j]<=mid;j++){
                    cnt++;
                }
            }
            if (cnt<k){
                lo = mid+1;
            }
            else hi = mid-1;
        }
        return lo;
    }
}
