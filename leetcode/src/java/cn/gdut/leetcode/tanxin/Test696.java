package cn.gdut.leetcode.tanxin;

import java.util.ArrayList;
import java.util.List;

public class Test696 {
    public int countBinarySubstrings(String s) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        char temp = s.charAt(0);
        int index = 0;
        for (int i = 1;i<s.length();i++){
            //若是连续相同的数
            if (s.charAt(i)==temp){
                list.set(index,list.get(index)+1);
            }
            //否则
            else
            {
                list.add(1);
                index++;
                temp = s.charAt(i);
            }
        }

        int result = 0;
        for (int i = 0;i<list.size()-1;i++){
            result+=Math.min(list.get(i),list.get(i+1));
        }

        return result;
    }
}
