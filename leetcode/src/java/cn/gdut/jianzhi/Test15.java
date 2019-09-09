package cn.gdut.jianzhi;

public class Test15 {
    /**
     * 统计二进制中1的个数
     * @param n
     * @return
     */
    public int numberOf1(int n){
        int cnt = 0;
        while (n != 0){
            n = n & (n - 1);
            cnt++;
        }
        return cnt;
    }
}
