package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test77 {
    public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> curRet = new ArrayList<>();
        tracking(ret, curRet, 1,k,n);
        return ret;

    }

    private void tracking(List<List<Integer>> ret,List<Integer> curRet, int start, int k, int n){
        if (k == 0){
            ret.add(new ArrayList<>(curRet));
            return;
        }
        for (int i = start;i<=n -k + 1;i++){
            curRet.add(i);
            tracking(ret,curRet, i+1, k-1,n);
            curRet.remove(curRet.size() - 1);
        }
    }


    public static void main(String[] args) {
        Test77 test77 = new Test77();
        System.out.println(test77.combine(4,3));
    }
}
