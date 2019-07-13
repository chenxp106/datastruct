package cn.gdut.leetcode.tanxin;

public class Test168 {
    public String convertToTitle(int n) {
        //递归出口，为0时返回空字符串
        if (n == 0){
            return "";
        }
        //从1开始，需要减1
        n--;
        //递归求解
        return convertToTitle(n / 26) + (char)((n%26) + 'A');
    }
}
