package cn.gdut.jianzhi;

import java.util.*;

public class Test41_2 {
    /**
     * 获取第一次出现的字符
     * 使用一个数组和队列，分别进队列中。数组用于保存出现的个数。每次进队列，就判断当前字符之前是否出现过，如果出现过，就将出队列。
     * @param ch
     */

    char []  chars = new char[256];
    Queue<Character> queue = new LinkedList<>();
    public void Insert(char ch){
        chars[ch]++;
        queue.add(ch);
        while ( !queue.isEmpty() && chars[queue.peek()] > 1){
            queue.poll();
        }
    }

    public char FirstAppearingOnce(){
        return queue.isEmpty() ? '#' : queue.peek();
    }

}
