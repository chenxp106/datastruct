package cn.gdut.leetcode.tanxin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test279 {
    public int numSquares(int n) {
        List<Integer> squres = genrateSquares(n);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] mark = new boolean[n+1];
        queue.add(n);
        mark[n] = true;
        int level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            level++;
            while (size-- > 0){
                //出队列当前值
                int cur = queue.poll();
                for (int s : squres){
                    int next = cur - s;
                    if (next < 0){
                        break;
                    }
                    if (next == 0){
                        return level;
                    }
                    if (mark[next]){
                        continue;
                    }
                    mark[next] = true;
                    queue.add(next);
                }
            }
        }
        return n;
    }
    //生成小于n的平方数
    private List<Integer> genrateSquares(int n){
        List<Integer> squares = new ArrayList<>();
        int square = 1;
        //从3开始形成等差数列
        int diff = 3;
        while (square <= n){
            squares.add(square);
            square +=diff;
            diff+=2;
        }
        return squares;
    }

    public static void main(String[] args) {
        Test279 test279 = new Test279();
        int n = test279.numSquares(14);

    }

}
