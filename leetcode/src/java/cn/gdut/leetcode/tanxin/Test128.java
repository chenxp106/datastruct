package cn.gdut.leetcode.tanxin;

import java.util.HashMap;

public class Test128 {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        //遍历nums将元素放到map中
        for (int num : nums){
            map.put(num,1);
        }

        //遍历nums，
        for (int num : nums){
            forword(map,num);
        }

        return getMax(map);

    }

    //遍历nums，返回当前元素的最大连续个数
    private int forword(HashMap<Integer,Integer> map,int num){
        //如果存在此元素，返回0
        if (!map.containsKey(num)){
            return 0;
        }
        //获取当前元素的连续个数
        int cnt = map.get(num);
        //如果当前连续的个数大于1,返回rnt
        if (cnt > 1){
            return cnt;
        }
        //递归
        cnt = forword(map,num+1)+1;
        //将当前的结果放回到map中
        map.put(num,cnt);
        return cnt;
    }

    private int getMax(HashMap<Integer,Integer> map){
        int max = 0;
        for (Integer i:map.keySet()){
            max = Math.max(max,map.get(i));
        }
        return max;
    }


}
