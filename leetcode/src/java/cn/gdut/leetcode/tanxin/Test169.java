package cn.gdut.leetcode.tanxin;

public class Test169 {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int majority = nums[0];
        for (int num : nums){
            if (cnt == 0){
                majority = num;
            }
            if (majority == num){
                cnt++;
            }
            else {
                cnt--;
            }
        }
        return majority;
    }
}
