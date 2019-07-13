package cn.gdut.leetcode.tanxin;

public class Test504 {
    public String convertToBase7(int num) {
        //等于0的情况
        if (num == 0){
            return "0";
        }
        //小于零,用一个标志位
        boolean isNegtive = num < 0;
        if (isNegtive){
            num = -num;
        }
        //大于0时进行处理
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0){
            stringBuilder.append(num % 7);
            num = num /7;
        }
        String res = stringBuilder.reverse().toString();
        return isNegtive ? "-"+res : res;
    }
}
