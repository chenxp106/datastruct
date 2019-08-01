package cn.gdut.leetcode.sousuo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test40 {
    public List<List<Integer>> combinationsSum2(int[] candidates,int target){
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> curRet = new LinkedList<>();
        boolean[] visited = new boolean[candidates.length];
        Arrays.sort(candidates);
        tracking(ret,curRet,visited,0,candidates, target);
        return ret;
    }

    private void tracking(List<List<Integer>> ret,List<Integer> curRet ,boolean[] visited,int start, int [] candidates, int target){
        if (target == 0){
            ret.add(new ArrayList<>(curRet));
            return;
        }
        for (int i = start;i<candidates.length;i++){
            if (i != 0 && candidates[i] == candidates[i-1] && !visited[i-1]){
                continue;
            }
            if (candidates[i] <= target){
                visited[i] = true;
                curRet.add(candidates[i]);
                tracking(ret, curRet,visited,i+1,candidates,target - candidates[i]);
                visited[i] = false;
                curRet.remove(curRet.size() - 1);
            }

        }
    }


    public static void main(String[] args) {
        Test40 test40 = new Test40();
        int [] candidates = {10,1,2,7,6,1,5};
        System.out.println(test40.combinationsSum2(candidates, 8));
    }
}
