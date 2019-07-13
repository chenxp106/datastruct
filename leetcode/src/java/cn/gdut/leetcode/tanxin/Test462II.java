package cn.gdut.leetcode.tanxin;

import java.util.Arrays;

public class Test462II {
    public int minMoves2(int[] nums){
        Arrays.sort(nums);
        int move = 0;
        int l = 0;
        int h = nums.length;
        while (l<=h){
            move += nums[h] - nums[l];
            l++;
            h--;
        }
        return move;
    }
}
