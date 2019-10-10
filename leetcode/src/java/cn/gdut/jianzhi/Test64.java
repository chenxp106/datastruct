package cn.gdut.jianzhi;

public class Test64 {
    public int Sum_Solution(int n){
        int sum = n;
        boolean b = (n > 0) && ((sum += Sum_Solution(n-1)) > 0);
        return sum;
    }
}
