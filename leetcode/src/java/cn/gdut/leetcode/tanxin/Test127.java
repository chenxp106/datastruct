package cn.gdut.leetcode.tanxin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        wordList.add(beginWord);
        int N = wordList.size();
        int start = N - 1;
        int end = 0;
        //判断endWord是否在wordlist中
        while (end < N && !wordList.get(end).equals(endWord)){
            end++;
        }
        //说明end不在wordList中，直接返回0
        if (end == N){
            return 0;
        }
        //构建图
        List<Integer>[] graphic = buildGraphic(wordList);
        return getShortPath(graphic,start,end);
    }

    //构建图
    private List<Integer>[] buildGraphic(List<String> wordList){
        int N = wordList.size();
        List<Integer>[] graphic = new List[N];
        for (int i = 0;i< N;i++){
            graphic[i] = new ArrayList<>();
            for (int j = 0;j<N;j++){
                if (isConnect(wordList.get(i),wordList.get(j))){
                    graphic[i].add(j);
                }
            }
        }
        return graphic;
    }

    //判断两个字符串是否相连
    private boolean isConnect(String s1,String s2){
        int diff = 0;
        for (int i = 0;i<s1.length() && diff <=1;i++){
            if (s1.charAt(i) != s2.charAt(i)){
                diff++;
            }
        }
        return diff == 1;
    }

    private int getShortPath(List<Integer>[] graphic,int start ,int end){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] mark = new boolean[graphic.length];
        queue.add(start);
        mark[start] = true;
        int path = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            path++;
            while (size-->0){
                int cur = queue.poll();
                for (int next : graphic[cur]){
                    if (next == end){
                        return path;
                    }
                    if (mark[next]){
                        continue;
                    }
                    mark[next] = true;
                    queue.add(next);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Test127 test127 = new Test127();
        String  begin = "hit";
        String end = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        int a = test127.ladderLength(begin,end,wordList);

    }
}
