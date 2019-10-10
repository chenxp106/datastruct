package cn.gdut.jianzhi;

public class Test62 {
    public int LastRemaining_Solution(int n,int m){
        // 处理特殊情况
        if(n == 0){
            return -1;
        }
        // 出口
        if (n == 1){
            return 1;
        }
        // 递归
        return (LastRemaining_Solution(n-1,m) + m) % n;
    }
}
