package cn.gdut.leetcode.tanxin;

import java.util.HashMap;

public class Test1 {
    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        //定义hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;i++){
            //如果存在key+当前的值=target，返回下标
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            //否则将num[i],i放入到map中
            else {
                map.put(nums[i],i);
            }
        }
        //如果没有，返回null
        return null;
    }
}
