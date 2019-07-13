package cn.gdut.leetcode.dongtai;

public class Test213 {
    public int rob(int[] nums){
        if (nums == null || nums.length == 1){
            return 0;
        }
        int n = nums.length;
        if ( n == 1){
            return nums[0];
        }
        return Math.max(rob(nums,0,n-2),rob(nums,1,n-1));
    }

    private int rob(int[] nums,int first,int last){
        int pre2 = 0;
        int pre1 = 0;
        int cur = pre1;
        for (int i = first;i <= last;i++){
            cur = Math.max(pre2+nums[i],pre1);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
}
