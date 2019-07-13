package cn.gdut.leetcode.tanxin;

import java.util.HashMap;
import java.util.Map;

public class Test697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> firstMap = new HashMap<>();
        Map<Integer,Integer> lastMap = new HashMap<>();
        //第一次遍历
        for (int i = 0;i<nums.length;i++){
            //获取当前的值
            int num = nums[i];
            //存储出现的次数
            map.put(num,map.getOrDefault(num,0)+1);
            //存储当前值最后一次出现的索引
            lastMap.put(num,i);
            //如果当前值是第一次出现，则将该值存储起来.存储第一次出现的索引
            if (!firstMap.containsKey(num)){
                firstMap.put(num,i);
            }
        }
        //第二次遍历。得到最大的度
        int maxCnt = 0;
        for (int num : nums){
            maxCnt = Math.max(maxCnt,map.get(num));
        }
        //第三次遍历，得到最小的连续度
        int res = nums.length;
        for (int num : nums){
            int cnt = map.get(num);
            if (maxCnt != cnt){
                continue;
            }
            res = Math.min(res,( lastMap.get(num) - firstMap.get(num) + 1) );
        }
        return res;

    }
}
