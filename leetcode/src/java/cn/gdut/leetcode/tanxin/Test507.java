package cn.gdut.leetcode.tanxin;

public class Test507 {
    public boolean checkPerfectNumber(int num) {
        //当num为1时，直接返回false
        if (num == 1){
            return false;
        }
        int res = 1;
        for (int i = 2;i<=Math.sqrt(num);i++){
            if (num % i == 0){
                res = res + i + num/i;
            }
        }
        return num == res ? true : false;

    }
}
