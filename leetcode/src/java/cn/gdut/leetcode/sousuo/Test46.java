package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.List;

public class Test46 {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ret = new ArrayList<>();
        if (nums == null){
            return ret;
        }
        List<Integer> curRet = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        tracking(ret,curRet,visited,nums);
        return ret;
    }

    private void tracking(List<List<Integer>> ret,List<Integer> curRet,boolean[] visited, int[] nums){
        if (curRet.size() == nums.length){
            ret.add(new ArrayList<>(curRet));
            return;
        }
        for (int i = 0;i<nums.length;i++){
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
        Test46 test46 = new Test46();
        int[] nums = {1,2,3};

        System.out.println(test46.permute(nums));
    }
}
