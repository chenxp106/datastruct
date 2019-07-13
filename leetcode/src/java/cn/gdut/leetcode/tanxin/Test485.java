package cn.gdut.leetcode.tanxin;

public class Test485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        //循环nums
        int max = 0;
        int flag = 0;
        for (int num : nums){
            if (num==1){
                flag++;

            }
            else {
                flag=0;
            }
            if (flag>max){
                max=flag;
            }
        }
        return max;
    }
}
