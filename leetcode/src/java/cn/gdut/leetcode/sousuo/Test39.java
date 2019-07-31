package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.List;

public class Test39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> curRut = new ArrayList<>();
        tracking(ret,curRut,0,candidates,target);
        return ret;

    }

    private void tracking(List<List<Integer>> ret, List<Integer> curRet, int start, int[] candidates,int target){
        if (target == 0){
            ret.add(new ArrayList<>(curRet));
            return;
        }
        for (int i = start;i<candidates.length;i++){
            if (candidates[i] <= target){
                curRet.add(candidates[i]);
                tracking(ret, curRet, i, candidates,target - candidates[i]);
                curRet.remove(curRet.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        Test39 test39 = new Test39();
        System.out.println(test39.combinationSum(candidates, 7));
    }
}
