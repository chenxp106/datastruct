package cn.gdut.leetcode.tanxin;

import java.util.HashMap;

public class Test594 {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //定义全局最大值max
        int max = 0;
        //统计个数
        for (int num:nums){
            //存在+1
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            //不存在，设置默认的1
            else {
                map.put(num,1);
            }
        }

        //遍历map，统计最大值
        for (Integer i:map.keySet()){
            int value1 = map.get(i);
            if (map.containsKey(i+1)){
                int value2 = map.get(i + 1);
                //如果值更大，则更新值
                if ((value1 + value2) > max){
                    max = value1 + value2;
                }
            }
        }
        return max;

    }
}
