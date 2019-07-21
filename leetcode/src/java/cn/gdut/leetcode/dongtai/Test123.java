package cn.gdut.leetcode.dongtai;

public class Test123 {
    public int maxProfit(int[] prices){
        if (prices.length == 0 || prices == null){
            return 0;
        }
        int buy1 = -prices[0];
        int sell1 = 0;
        int buy2 = -prices[0];
        int sell2 = 0;
        for (int p : prices){
            buy1 = Math.max(buy1,-p);
            sell1 = Math.max(sell1,buy1 + p);
            buy2 = Math.max(buy2,sell1 - p);
            sell2 = Math.max(sell2, buy2 + p);
        }
        return sell2;
    }
}
