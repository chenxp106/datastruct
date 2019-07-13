package cn.gdut.leetcode.tanxin;

import java.util.Arrays;

public class Test455 {
    public int findContentChildren(int[] g, int[] s) {
        //先对数据进行排序
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0;
        int si = 0;
        while (gi<g.length && si < s.length){
            //当前能满足的时候
            if (g[gi] <= s[si]){
                gi++;
            }
            //饼干都要加一
            si++;
        }
        return gi;
    }
}
