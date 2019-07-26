package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.List;

public class Test93 {

    public List<String> restoreIpAddress(String s){
        List<String> address = new ArrayList<>();
        StringBuilder tempAddress = new StringBuilder();

        doRestore(0,tempAddress,address,s);
        return address;
    }

    private void doRestore(int k,StringBuilder tempAddress,List<String> address,String s){
        if (k == 4 || s.length() == 0){
            if (k == 4 && s.length() == 0){
                address.add(tempAddress.toString());
            }
            return;
        }

        for (int i = 0;i<s.length() && i<=2;i++){
            if (i!=0 && s.charAt(0) == '0'){
                break;
            }

            String part = s.substring(0,i+1);
            if (Integer.valueOf(part) <= 255){
                if (tempAddress.length() !=  0){
                    part = "." + part;
                }
                tempAddress.append(part);
                doRestore(k+1,tempAddress,address,s.substring(i+1));
                tempAddress.delete(tempAddress.length() - part.length(),tempAddress.length());
            }
        }
    }

    public static void main(String[] args) {
        String  s = "25525511135";
        Test93 test93 = new Test93();
        List<String> strings = test93.restoreIpAddress(s);
        System.out.println(strings);

    }
}
