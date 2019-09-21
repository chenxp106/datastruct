package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.Arrays;

public class Test38 {
    private ArrayList<String> ret = new ArrayList<>();
    public ArrayList<String> Permutation(String str){
        if (str.length() == 0){
            return ret;
        }
        char [] chars = str.toCharArray();
        Arrays.sort(chars);
        boolean[] hasUsed = new boolean[chars.length];
        tracking(chars, hasUsed, new StringBuilder());
        return ret;
    }

    private void tracking(char [] chars, boolean[] hasUsed, StringBuilder s){
        if (s.length() == chars.length){
            ret.add(s.toString());
            return;
        }
        for (int i = 0; i< chars.length;i++){
            if (hasUsed[i]){
                continue;
            }
            //如果元素重复，则跳过，
            if (i != 0 && chars[i] == chars[i-1] && !hasUsed[i-1]){
                continue;
            }
            hasUsed[i] = true;
            s.append(chars[i]);
            tracking(chars, hasUsed, s);
            s.deleteCharAt(s.length() - 1);
            hasUsed[i] = false;
        }
    }
}
