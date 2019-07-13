package cn.gdut.leetcode.tanxin;

import java.util.Arrays;
import java.util.Comparator;

public class Test452 {
    public int findMinAeeowShots(int[][] points){
        //判空
        if (points.length == 0){
            return 0;
        }
        // 排序和初始化
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int cnt = 1;
        int end = points[0][1];
        for (int i = 0;i < points.length;i++){
            if (points[i][0] <= end){
                continue;
            }
            cnt++;
            end = points[i][1];
        }
        return cnt;
    }
}
