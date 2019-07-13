package cn.gdut.leetcode.tanxin;

import java.util.ArrayList;
import java.util.List;

public class Test763 {
    public List<Integer> partitionLables(String S){
        int[] lastIndexOfchar = new int[26];
        for (int i = 0;i<S.length();i++){
            lastIndexOfchar[char2Index(S.charAt(i))] = i;
        }
        List<Integer> partitions = new ArrayList<>();
        int firstIndex = 0;
        while (firstIndex<S.length()){
            int lastIndex = firstIndex;
            for (int i = firstIndex;i<S.length() && i<=lastIndex;i++){
                int index = lastIndexOfchar[char2Index(S.charAt(i))];
                if (index>lastIndex){
                    lastIndex = index;
                }
            }
            partitions.add(lastIndex - firstIndex +1);
            firstIndex = lastIndex+1;
        }
        return partitions;
    }

    private int char2Index(char c){
        return c - 'a';
    }

    public static void main(String[] args) {
        Test763 test763 = new Test763();
        String s = "ababcbacadefegdehijhklij";
        List<Integer> res = test763.partitionLables(s);
        System.out.println(res);
    }
}
