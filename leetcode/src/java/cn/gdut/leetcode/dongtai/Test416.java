package cn.gdut.leetcode.dongtai;

public class Test416 {
    public boolean canPartition(int[] nums){
        int sum = computeArraySum(nums);
        if (sum % 2 != 0){
            return false;
        }
        int W = sum / 2;
        boolean[] dp = new boolean[W+1];
        dp[0] = true;
        for (int num : nums){
            for (int i = W;i >=num;i--){
                dp[i] = dp[i] || dp[i - num];
            }
        }
        return dp[W];
    }

    private int computeArraySum(int[] nums){
        int sum = 0;
        for (int num :nums){
            sum+=num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        Test416 test416 = new Test416();
        boolean res = test416.canPartition(nums);
        System.out.println(res);

    }
}
