package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test10 {
    public int Fibonacci(int n){
        if (n <= 1){
            return n;
        }
        int fib = 0;
        int fibpre = 0;
        int fibnext = 1;
        for (int i = 2;i<=n;i++){
            fib = fibnext + fibpre;
            fibpre = fibnext;
            fibnext = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        int n = 6;
        Test10 test10 = new Test10();
        System.out.println(test10.Fibonacci(n));
    }
}
