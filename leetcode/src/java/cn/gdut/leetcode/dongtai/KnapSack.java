package cn.gdut.leetcode.dongtai;

public class KnapSack {
    public int knapSack(int W,int N,int[] weights,int[] values){
        //定义二维数组用于存放前i键物品体积不超过j的情况下能达到的最大价值。
        int[][] dp = new int[N+1][W+1];
        for (int i = 1;i<=N;i++){
            int w = weights[i-1];
            int v = values[i-1];
            for (int j = 1;j<=W;j++){
                //当能放入这个物品时，取放入的情况与不放的最大值。
                if (j>=w){
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w]+v);
                }
                //背包不足于放入物品的时候。即不放入。dp的值取dp[i-1][j];
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[N][W];
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
