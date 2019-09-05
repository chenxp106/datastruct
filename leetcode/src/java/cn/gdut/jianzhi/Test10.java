package cn.gdut.jianzhi;

public class Test10 {
    public int Fibonacci(int n){
        if (n<=1){
            return n;
        }
        int fib = 0;
        int fib1 = 0;
        int fib2 = 1;
        for (int i = 2;i<=n;i++){
            fib = fib1+fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        int n = 3;
        Test10 test10 = new Test10();
        System.out.println(test10.Fibonacci(n));
    }
}
