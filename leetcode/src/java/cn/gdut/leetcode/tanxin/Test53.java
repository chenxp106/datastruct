package cn.gdut.leetcode.tanxin;

public class Test53 {
    public int maxSubArray(int[] nums){
        int len = nums.length;
        if (len == 0){
            return 0;
        }
        int preSum = nums[0];
        int maxSum = preSum;
        for (int i = 1;i<len;i++){
            //当前的值+之前的和如果小于零，则取当前的和为当前的值，否则取加和
            preSum  = preSum >0 ? preSum + nums[i] : nums[i];
            //max取preSum和maxSum
            maxSum = Math.max(preSum,maxSum);
        }
        //最后返回maxSum
        return maxSum;
    }
}
