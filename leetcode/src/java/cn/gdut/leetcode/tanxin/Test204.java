package cn.gdut.leetcode.tanxin;

public class Test204 {
    public int countPrimes(int n) {
        if (n<3){
            return 0;
        }
        int cnt = 0;
        boolean[] arr = new boolean[n];
        for (int i = 2;i<n;i++){
            if (arr[i]==false){
                cnt++;
                //从2开始i*j的倍数都不是质数
                for (int j = 2;i * j< n;j++){
                    arr[i*j] = true;
                }
            }
        }
        return cnt;
    }
}
