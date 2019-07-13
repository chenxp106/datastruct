package cn.gdut.leetcode.tanxin;

public class Test67 {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int i = a.length() -1 ;
        int j = b.length() - 1;
        int carry = 0;
        while (carry > 0 || i >= 0|| j>= 0){
            if (i>=0 && a.charAt(i--) == '1'){
                carry++;
            }
            if (j >= 0 && b.charAt(j--) == '1'){
                carry++;
            }
            str.append(carry % 2);
            carry = carry / 2;
        }
        return str.reverse().toString();
    }
}
