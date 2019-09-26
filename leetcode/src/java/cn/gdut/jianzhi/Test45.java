package cn.gdut.jianzhi;

import java.util.Arrays;

public class Test45 {
    public String PrintMinNumber(int [] numbers){
        if (numbers == null || numbers.length == 0){
            return null;
        }
        int n = numbers.length;
        String[] nums = new String[n];
        for (int i = 0;i < n;i++){
            nums[i] = numbers[i] + "";
        }
        Arrays.sort(nums, (s1, s2) -> (s1+s2).compareTo(s2+s1));
        String ret = "";
        for (String str : nums){
            ret +=str;
        }
        return ret;

    }

    public static void main(String[] args) {
        Test45 test45 = new Test45();
        int [] a = {321};
        System.out.println(test45.PrintMinNumber(a));
    }
}
