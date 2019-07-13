package cn.gdut.leetcode.tanxin;

public class Test326 {
    public boolean isPowerOfThree(int n) {
        double tmp = Math.log10(n)/Math.log10(3.0);
        return (int)tmp-tmp==0;
    }
}
