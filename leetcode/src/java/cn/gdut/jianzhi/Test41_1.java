package cn.gdut.jianzhi;

import java.util.PriorityQueue;

public class Test41_1 {

    // 大顶堆
    private PriorityQueue<Integer> left = new PriorityQueue<>(((o1, o2) -> o2 - o1));

    // 小订堆
    private PriorityQueue<Integer> right = new PriorityQueue<>();

    // 当前数据流读入的个数
    private int N = 0;

    public void Insert(Integer num){
        /**
         * N 为偶数的情况插入到右半边
         * 因为右半边的都大于左半边，但是新插入的元素不一定都比左半边的元素大
         * 因为，先将元素插入到左半边，然后利用作伴为大顶堆的特点，取出订元素即为最大元素。此时插入右半边
         */
        if (N % 2 == 0){
            left.add(num);
            right.add(left.poll());
        }
        else {
            right.add(num);
            left.add(right.poll());
        }
        N++;
    }

    public Double GetMdian(){
        if (N % 2 == 0){
            return (left.peek() + right.peek()) / 2.0;
        }
        else{
            return (double)right.peek();
        }
    }
}
