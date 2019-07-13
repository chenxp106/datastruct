package cn.gdut.leetcode.tanxin;

public class Test122 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0){
            return 0;
        }
        /*int res = 0;
        int min = prices[0];
        int max = 0;
        for (int i = 0;i<n ;i++){
            int cur = prices[i] - min;
            if (cur < max && prices[i] > prices[i-1]){
                min = prices[i];
                res += max;
                max = 0;
            }
            if (cur > 0 && cur > max){
                cur = max;
            }
            min = Math.min(min,prices[i]);
        }
        return res < max ? max : res;*/
        int res = 0;
        for (int i = 1;i<n;i++){
            int cur = prices[i] - prices[i-1];
            if (cur > 0){
                res+=cur;
            }
        }
        return res;
    }
}
