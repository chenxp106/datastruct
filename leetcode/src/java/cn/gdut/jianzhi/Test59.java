package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Test59 {
    public ArrayList<Integer> maxWindows(int [] num, int size){
        // 定义结果
        ArrayList<Integer> ret = new ArrayList<>();
        if (size <= 0 || size > num.length){
            return ret;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(((o1, o2) -> o2 - o1));
        for (int i = 0 ;i < size;i++){
            heap.add(num[i]);
        }
        ret.add(heap.peek());

        for (int i = 0,j = i+size;j < num.length;i++,j++){
            heap.add(num[j]);
            heap.remove(num[i]);
            ret.add(heap.peek());
        }

        return ret;

    }
}
