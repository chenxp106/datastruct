package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test47 {
    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> ret = new ArrayList<>();
        if (nums == null){
            return ret;
        }
        List<Integer> curRet = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        tracking(ret,curRet,visited,nums);
        return ret;
    }

    private void tracking(List<List<Integer>> ret,List<Integer> curRet,boolean[] visited,int[] nums){
        if (curRet.size() == nums.length){
            ret.add(new ArrayList<>(curRet));
            return;
        }
        // 遍历
        for (int i = 0; i< nums.length ;i++){
            if (i != 0 && nums[i] == nums[i-1] && !visited[i-1]){
                continue;
            }
            if (visited[i]){
                continue;
            }
            visited[i] = true;
            curRet.add(nums[i]);
            tracking(ret,curRet,visited,nums);
            curRet.remove(curRet.size() - 1);
            visited[i] = false;
        }
    }
    public static void main(String[] args) {
        Test47 test47 = new Test47();
        int[] nums = {1,1,3};

        System.out.println(test47.permuteUnique(nums));
    }
}
