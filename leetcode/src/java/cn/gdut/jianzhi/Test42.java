package cn.gdut.jianzhi;

public class Test42 {

    public int FindGreatstSumOfSubArray(int [] array){
        int sum = 0;
        int geatestSum = Integer.MIN_VALUE;
        for (int val : array){
            sum = sum <= 0 ? val : sum + val;
            geatestSum = Math.max(geatestSum, sum);
        }
        return geatestSum;

    }

    public static void main(String[] args) {
        int [] a = {-3,-2,-1};
        Test42 test42= new Test42();
        System.out.println(test42.FindGreatstSumOfSubArray(a));
    }
}
