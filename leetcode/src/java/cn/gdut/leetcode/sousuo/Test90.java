package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test90 {
    public List<List<Integer>> subsetWithDup(int[] nums){
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> curRet = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        for (int k = 0;k<=nums.length;k++){
            tracking(ret,curRet,0,visited,k,nums);
        }
        return ret;
    }

    private void tracking(List<List<Integer>> ret, List<Integer> curRet,int start,boolean[] visited,int k,int[] nums){
        if (curRet.size() == k){
            ret.add(new ArrayList<>(curRet));
            return;
        }
        for (int i = start;i<nums.length;i++){
            if (i != 0 && nums[i] == nums[i - 1] && !visited[i-1]) {
                continue;
            }
            curRet.add(nums[i]);
            visited[i] = true;
            tracking(ret, curRet, i+1,visited,k,nums);
            visited[i] = false;
            curRet.remove(curRet.size() - 1);

        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Test90 test90 = new Test90();
        System.out.println(test90.subsetWithDup(nums));
    }
}
