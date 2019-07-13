package cn.gdut.leetcode.tanxin;

public class Test287 {
    public int findDuplicate(int[] nums) {
        int hi = nums.length-1;
        int lo = 1;
        //二分查找
        while (lo<hi){
            int cnt = 0;
            int mid = lo + (hi - lo) / 2;
            for (int i :nums){
                //统计个数
                if (i<=mid){
                    cnt++;
                }
            }
            //如果个数小于mid，则说明重复的数在后面
            if (cnt<=mid){
                hi = mid-1;
            }
            //否则，在左边
            else {
                lo = mid;
            }
        }
        //返回low
        return lo;

    }
}
