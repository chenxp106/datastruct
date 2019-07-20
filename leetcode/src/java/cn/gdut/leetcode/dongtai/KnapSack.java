package cn.gdut.leetcode.dongtai;

import java.util.Map;

public class KnapSack {
    public int knapSack(int W,int N,int[] weights,int[] values){
        /*//定义二维表示前i件物品体积不超过j的情况下达到的最大价值。
        int[][] dp = new int[N+1][W+1];
        for (int i = 1;i<=N;i++){
            int w = weights[i-1];
            int v = values[i-1];
            for (int j = 1;j<=W;j++){
                //如果放的下，则取当前放下的最大值dp[i-1][j-w]+v和   前一个的较大者dp[ i-1][j]
                if (j>=w){
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w] + v);
                }
                //如果放不下，则取之前的拿个值。dp[i-1][j]
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[N][W];*/

        int[] dp = new int[W+1];
        for (int i = 1;i<=N;i++){
            int w = weights[i-1];
            int v = values[i-1];
            for (int j = W;j>=1;j--){
                if (j>=w){
                    dp[j] = Math.max(dp[j],dp[j-w]+v);
                }
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        int W = 10;
        int N = 5;
        int[] weight = {2,2,6,5,4};
        int[] values = {6,3,5,4,6};
        KnapSack knapSack = new KnapSack();
        int res = knapSack.knapSack(W,N,weight,values);
        System.out.println(res);
    }
}
