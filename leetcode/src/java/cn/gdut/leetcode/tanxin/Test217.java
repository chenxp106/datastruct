package cn.gdut.leetcode.tanxin;

import java.util.HashMap;
import java.util.HashSet;

public class Test217 {
    public boolean containsDuplicate(int[] nums){
        /*HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return false;
            }
            else {
                map.put(nums[i],0);
            }
        }
        return true;*/

        HashSet set = new HashSet();
        for (int num : nums){
            set.add(num);
        }
        return nums.length>set.size();
    }
}
