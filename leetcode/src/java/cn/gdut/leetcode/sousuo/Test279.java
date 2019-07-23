package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test279 {
    public int numSquare(int n){
        List<Integer> square = generateSquare(n);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] marked = new boolean[n+1];
        queue.add(n);
        marked[n] = true;
        int level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            level++;
            while (size-->0){
                int cur = queue.poll();
                for (int s : square){
                    int next = cur - s;
                    if (next < 0){
                        break;
                    }
                    if (next == 0){
                        return level;
                    }
                    if (marked[next]){
                        continue;
                    }
                    marked[next] = true;
                    queue.add(next);
                }
            }
        }
        return level;
    }

    private List<Integer> generateSquare(int n){
        List<Integer> square = new ArrayList<>();
        int k = 1;
        int ini = 3;
        while (k<n){
            square.add(k);
            k = k + ini;
            ini +=2;

        }
        return square;
    }
}
