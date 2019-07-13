package cn.gdut.leetcode.tanxin;

public class Test415 {
    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (carry > 0|| i >= 0|| j>=0){
            if (i >= 0){
                carry = carry + (int)(num1.charAt(i) - '0');
            }
            if (j >= 0){
                carry = carry + (int)(num2.charAt(j) - '0');
            }
            str.append(carry % 10);
            carry = carry / 10;
        }
        return str.reverse().toString();
    }
}
