package cn.gdut.leetcode.tanxin;

public class Test367 {
    public boolean isPerfectSquare(int num) {
        /*int n = 1;
        while (n < (num/n)){
            if ( (num/n) == n){
                return true;
            }
            n++;
        }
        return false;*/
        int subNum = 1;
        while (num > 0){
            num = num - subNum;
            subNum+=2;
        }
        return num == 0;
    }
}
