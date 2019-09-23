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
        boolean [] hasUsed = new boolean[chars.length];
        StringBuilder s = new StringBuilder();
        tracking(hasUsed, s, chars);
        return ret;
    }
    private void tracking(boolean [] hasUsed,StringBuilder s, char [] chars){
        if (s.length() == chars.length){
            ret.add(s.toString());
            return;
        }

        for (int i = 0;i < chars.length; i++){
            if (hasUsed[i]){
                continue;
            }
            if (i != 0 && chars[i] != chars[i-1] && !hasUsed[i-1]){
                continue;
            }
            hasUsed[i] = true;
            s.append(chars[i]);
            tracking(hasUsed,s,chars);
            s.deleteCharAt(s.length() - 1);
            hasUsed[i] = false;
        }

    }

    public static void main(String[] args) {
        Test38 test38 = new Test38();
        String s = "abc";
        System.out.println(test38.Permutation(s));
    }

}
