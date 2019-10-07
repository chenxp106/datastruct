package cn.gdut.jianzhi;

public class Test62 {
    public int LastRemaining_Solution(int n,int m){
        if (n == 0){
            return -1;
        }
        if (n == 1){
            return 0;
        }
        return (LastRemaining_Solution(n-1,m) + m) % n;
    }
}
