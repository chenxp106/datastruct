package cn.gdut.leetcode.tanxin;

public class Test645 {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length;
        int[] num = new int[len];
        int[] res = new int[2];
        for (int i = 0;i<nums.length;i++){
            int k = nums[i]-1;
            num[k]++;
        }
        for (int i = 0;i<num.length;i++){
            if (num[i]==2){
                res[0] = i+1;
            }
            else if (num[i] == 0){
                res[1] = i+1;
            }
        }
        return res;
    }
}
