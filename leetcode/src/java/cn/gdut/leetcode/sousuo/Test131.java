package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.List;

public class Test131 {
    public List<List<String>> partion(String s){
        List<List<String>> ret = new ArrayList<>();
        List<String> curRet = new ArrayList<>();
        tracking(ret,curRet,s);
        return ret;

    }

    private void tracking(List<List<String>> ret,List<String> curRet,String s){
        if (s.length() == 0){
            ret.add(new ArrayList<>(curRet));
            return;
        }
        for (int i = 0;i<s.length();i++){
            // 判断是否为回文
            if (isPalingdrome(s,0,i)){
                curRet.add(s.substring(0,i + 1));
                tracking(ret,curRet,s.substring(i+1));
                curRet.remove(curRet.size() - 1);
            }
        }
    }

    private boolean isPalingdrome(String s, int start,int end){
        while (start < end){
            if (s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aaabbcaa";
        Test131 test131 = new Test131();
        System.out.println(test131.partion(s));
    }
}
