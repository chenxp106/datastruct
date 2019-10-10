package cn.gdut.jianzhi;

public class Test63 {
    public int maxProfit(int [] prices){
        int max = 0;
        int buy = prices[0];
        for (int i = 1;i<prices.length - 1;i++){
            buy = prices[i] < buy ? prices[i] : buy;
            int temp = prices[i] - buy;
            max = temp > max ? temp : max;

        }
        return max;
    }

    public static void main(String[] args) {
        Test63 test63 = new Test63();
        int [] prices = {7,1,5,3,6,4};
        System.out.println(test63.maxProfit(prices));
    }
}
