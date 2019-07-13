package cn.gdut.leetcode.dongtai;

public class Test303 {
    private int[] sums;
    //记录前n个数的和
    public Test303(int[] nums){
        sums = new int[nums.length+1];
        sums[0] = 0;
        for (int i = 0;i<nums.length;i++){
            sums[i+1] = sums[i]+nums[i];
        }
    }

    public int sumRange(int i,int j){
        //计算区间的值，只要将前j+1的和减去i的值
        return sums[j+1] - sums[i];
    }
}
