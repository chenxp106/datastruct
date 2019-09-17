package cn.gdut.jianzhi;

import java.util.Stack;

public class Test30 {

    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void  push(int node){
        // data正常入栈
        dataStack.push(node);
        // 将更小的值入栈
        minStack.push(minStack.isEmpty() ? node : Math.min(node, minStack.peek()));
    }

    public void  pop(){
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min(){
        return minStack.peek();
    }
}
