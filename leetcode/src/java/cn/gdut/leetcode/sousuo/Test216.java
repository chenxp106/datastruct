package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.List;

public class Test216 {
    public List<List<Integer>> combinationsSum3(int k,int n){
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> curRet = new ArrayList<>();
        tracking(ret,curRet,1,k,n);
        return ret;
    }

    public void tracking(List<List<Integer>> ret,List<Integer> curRet,int start, int k,int n){
        if (curRet.size() == k ){
            if (n == 0){
                ret.add(new ArrayList<>(curRet));
            }
            return;
        }
        for (int i = start;i<=9;i++){
            if (i<=n){
                curRet.add(i);
                tracking(ret,curRet,i+1,k,n - i);
                curRet.remove(curRet.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Test216 test216 =new  Test216();
        System.out.println(test216.combinationsSum3(3,9));
    }
}
