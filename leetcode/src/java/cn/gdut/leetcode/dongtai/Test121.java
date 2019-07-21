package cn.gdut.leetcode.dongtai;

public class Test121 {
    public int maxProfit(int[] prices){
        if (prices == null || prices.length == 0){
            return 0;
        }
        int buy = prices[0];
        int sell = 0;
        for (int p : prices){
            buy = Math.min(buy,p);
            sell = Math.max(sell,p - buy);
        }
        return sell;
    }
}
