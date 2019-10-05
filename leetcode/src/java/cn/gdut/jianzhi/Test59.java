package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Test59 {
    public ArrayList<Integer> maxWindows(int [] num, int size){
        ArrayList<Integer> list = new ArrayList<>();
        if (size > num.length){
            return list;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0;i< size;i++)
            heap.add(num[i]);
        list.add(heap.peek());
        for (int i = 0,j = i + size;j < num.length ;i++,j++){
            heap.remove(num[i]);
            heap.add(num[j]);
            list.add(heap.peek());
        }
        return list;
    }
}
