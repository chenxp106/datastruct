package cn.gdut.leetcode.tanxin;

import java.util.Arrays;
import java.util.Comparator;

public class Test435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        //判空
        if (intervals.length == 0){
            return 0;
        }
        //排序
        Arrays.sort(intervals, Comparator.comparing(o -> o[1]));
        int cnt = 1;
        int end = intervals[0][1];
        for (int i = 1;i<intervals.length;i++){
            //选择最小的end，这样才能找到尽可能多的不重复的期间
            if (intervals[i][0] < end){
                continue;
            }
            cnt++;
            end = intervals[i][1];
        }
        return intervals.length - cnt;
    }
}
