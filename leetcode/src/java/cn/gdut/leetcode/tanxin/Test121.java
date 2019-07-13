package cn.gdut.leetcode.tanxin;

public class Test121 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0){
            return 0;
        }
        //定义最大输出和初始化
        int max = 0;
        int min = prices[0];
        for (int i = 1;i<n;i++){
            int cur = prices[i] - min;
            //如果当前的收益更大，更新收益
            if (cur > 0 && cur > max){

                max = cur;
            }
            //计算最小值
            min = Math.min(min,prices[i]);
        }
        return max;
    }
}
