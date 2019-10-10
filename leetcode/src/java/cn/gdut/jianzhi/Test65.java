package cn.gdut.jianzhi;

public class Test65 {
    public int Add(int num1, int num2){
        // 定义和进位
        int sum = num1;
        int carry = 0;
        while (num2 != 0 ){
            // 无进位数的和 1010+111
            // 得到sum为101
            sum = num1 ^ num2;
            // 进位10<<1 = 100
            carry = (num1 & num2)<<1;
            num1 = sum;
            num2 = carry;
        }
        return sum;
    }

}
