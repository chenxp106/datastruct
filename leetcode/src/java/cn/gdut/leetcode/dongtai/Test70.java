package cn.gdut.leetcode.dongtai;

public class Test70 {
    public int climbStair(int n){
        int pre2 = 1;
        int pre1 = 2;
        if (n == 1){
            return pre2;
        }
        if ( n == 2){
            return pre1;
        }
        for (int i = 2;i<n;i++){
            int cur = pre1 + pre2;
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
}
