package cn.gdut.jianzhi;

import java.util.*;

public class Test41_2 {

    char [] chars = new char[256];
    Queue<Character> queue = new LinkedList<>();

    public void Insert(char ch){
        //进栈和队列
        chars[ch]++;
        queue.add(ch);
        // 每次进栈都要出栈，把相同的
        while (!queue.isEmpty() && chars[queue.peek()] > 1){
            queue.poll();
        }
    }

    public char FirstAppearingOnce(){
        return queue.isEmpty() ? '#' : queue.peek();
    }

    public static void main(String[] args) {

    }
}
