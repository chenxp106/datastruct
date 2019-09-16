package cn.gdut.jianzhi;

import java.util.Stack;

public class Test30 {

    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void  push(int node){
        dataStack.push(node);
        minStack.push(minStack.isEmpty() ? node : Math.min(minStack.peek(), node));

    }

    public void  pop(){
        dataStack.pop();
        minStack.pop();
    }

    public int top(){
        return dataStack.peek();
    }

    public int min(){
        return minStack.peek();
    }
}
