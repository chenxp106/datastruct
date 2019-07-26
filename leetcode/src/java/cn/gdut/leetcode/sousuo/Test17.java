package cn.gdut.leetcode.sousuo;

import java.util.ArrayList;
import java.util.List;

public class Test17 {

    private static final String[] KEYS = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits){
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0){
            return res;
        }
        doCommoction(new StringBuilder(),res,digits);
        return res;

    }

    private void doCommoction(StringBuilder prefix,List<String> res,String digits){
        if (prefix.length() == digits.length()){
            res.add(prefix.toString());
            return;
        }
        int curDigits = digits.charAt(prefix.length()) - '0';
        String letters = KEYS[curDigits];
        for (char c : letters.toCharArray()){
            // 添加当前字符
            prefix.append(c);
            doCommoction(prefix,res,digits);
            // 删除后面那个字符
            prefix.deleteCharAt(prefix.length()-1);
        }
    }





}
