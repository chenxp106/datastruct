package cn.gdut.leetcode.tanxin;

import java.util.Arrays;

public class Test238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,1);
        int left = 1;
        for (int i = 1;i<n;i++){
            left *= nums[i - 1];
            res[i] *= left;
        }
        int right = 1;
        for (int i = n-2;i>=0;i--){
            right *= nums[i+1];
            res[i] *= right;
        }
        return res;
    }
}
