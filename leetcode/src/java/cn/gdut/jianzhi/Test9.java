package cn.gdut.jianzhi;

import java.util.Stack;

public class Test9 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
         stack1.push(node);
    }

    public int pop(){
        // 如果栈为空，则从栈1中的所有元素出栈到栈2中。
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
