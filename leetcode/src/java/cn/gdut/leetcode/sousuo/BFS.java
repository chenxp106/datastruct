package cn.gdut.leetcode.sousuo;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public int minPathLength(int[][] grids,int tr,int tc){
        int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
        int m = grids.length;
        int n = grids[0].length;
        Queue<Pair<Integer,Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(0,0));
        int pathlenth = 0;
        // 队列不为空时循环
        while (!queue.isEmpty()){
            int size = queue.size();
            // 路径加1
            pathlenth++;
            while (size-->0){
                // 出队列一个元素
                Pair<Integer,Integer> cur = queue.poll();
                int cr = cur.getKey();
                int cc = cur.getValue();
                // 标记访问
                grids[cr][cc] = 0;
                for (int[] d : direction){
                    int nr = cr + d[0];
                    int nc = cc + d[1];
                    // 判断越界情况
                    if (nr <0 || nr >=m || nc >=n || nc <0 || grids[nr][nc] == 0 ){
                        continue;
                    }
                    if (nr == tr && nc == tc){
                        return pathlenth;
                    }
                    queue.add(new Pair<>(nr,nc));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        int[][] grids = {   {1,1,0,1},
                            {1,0,0,0},
                            {1,1,1,1},
                            {1,0,1,1}};
        int len = bfs.minPathLength(grids,3,1);
        System.out.println(len);
    }


}
