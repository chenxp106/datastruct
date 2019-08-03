package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.List;

public class Test78 {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> curRet = new ArrayList<>();
        for(int k = 0;k<=nums.length;k++){
            tracking(ret,curRet,0,k,nums);
        }
        return ret;

    }

    private void tracking(List<List<Integer>> ret,List<Integer> curRet,int start,int k,int[] nums){
        if (k == 0){
            ret.add(new ArrayList(curRet));
            return;
        }
        for (int i = start;i<nums.length;i++){
            curRet.add(nums[i]);
            tracking(ret,curRet, i+1,k-1,nums);
            curRet.remove(curRet.size() - 1);

        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Test78 test78 = new Test78();
        System.out.println(test78.subsets(nums));
    }
}
