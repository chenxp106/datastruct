package cn.gdut.leetcode.tanxin;

import java.util.Arrays;

public class Test628 {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        //所有数都为负数，取最小的负数
        int a = nums[0] * nums[1] * nums[2];
        //三个都为正数
        int b = nums[n-1] * nums[n-2] * nums[n-3];
        //两个负数，一个正数
        int c = nums[0] * nums[1] * nums[n-1];
        return Math.max(a,Math.max(b,c));
    }
}
