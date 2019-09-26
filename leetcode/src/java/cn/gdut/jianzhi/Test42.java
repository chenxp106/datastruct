package cn.gdut.jianzhi;

public class Test42 {

    public int FindGreatstSumOfSubArray(int [] array){
        int big = Integer.MIN_VALUE;
        int sum = 0;
        for (int val : array){
            sum = sum > 0 ? sum + val : val;
            big = Math.max(big, sum);
        }

        return sum;

    }

}
