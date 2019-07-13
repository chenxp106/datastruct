package cn.gdut.leetcode.tanxin;

public class Test283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums){
            //不为0则将值前移
            if (num != 0){
                nums[index] = num;
                index++;
            }
        }
        //将后面补0
        while (index<nums.length){
            nums[index++] = 0;
        }
    }
}
