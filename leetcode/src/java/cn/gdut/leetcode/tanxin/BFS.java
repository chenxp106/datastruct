package cn.gdut.leetcode.tanxin;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public int minPathLength(int[][] grids,int tr,int tc){
        final int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
        final int m = grids.length;
        final int n = grids[0].length;
        Queue<Pair<Integer,Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(0,0));
        int pathLength = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            pathLength++;
            while (size-- > 0){
                Pair<Integer,Integer> cur = queue.poll();
                int cr = cur.getKey();
                int cc = cur.getKey();
                grids[cr][cc] = 0;
                for (int[] d : direction){
                    int nr = cr + d[0],nc = cc+d[1];
                    //判断是否越界或是已经遍历过，若是，则遍历下一个
                    if (nc < 0 || nr >= m || nc >= n || grids[nr][nc] == 0){
                        continue;
                    }
                    //判断是否到达了指定的点，若是，则直接返回路径长度
                    if (nr == tr && nc == tc){
                        return pathLength;
                    }
                    //将当前节点加到队列中
                    queue.add(new Pair<>(nr,nc));
                }

            }
        }
        //没有找到返回-1
        return -1;
    }

}
