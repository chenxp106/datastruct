package cn.gdut.leetcode.tanxin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test406 {
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        //按身高降序排，按人数升序排
        Arrays.sort(people,(a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
        //将k查到队列的对应位置
        List<int[]> queue = new ArrayList<>();
        for (int[] p : people){
            queue.add(p[1],p);
        }
        return queue.toArray(new int[queue.size()][]);
    }
}
