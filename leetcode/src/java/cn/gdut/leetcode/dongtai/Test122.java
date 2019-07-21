package cn.gdut.leetcode.dongtai;

public class Test122 {
    public int maxProfit(int[] prices){
        if (prices.length == 0 || prices == null){
            return 0;
        }
        int buy = -prices[0];
        int sell = 0;
        for (int p : prices){
            buy = Math.max(buy,sell-p);
            sell = Math.max(sell,p + buy);
        }
        return sell;
    }

    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        Test122 test122 = new Test122();
        System.out.println(test122.maxProfit(price));
    }
}
