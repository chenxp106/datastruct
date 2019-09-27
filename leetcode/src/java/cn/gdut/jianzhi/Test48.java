package cn.gdut.jianzhi;

import java.util.Arrays;

public class Test48 {
    public int longestSubStringWithDuplication(String str){
        int curLen = 0;
        int maxLex = 0;

        // 定义数组用于存放每个字符出现的次数
        int[] preIndex = new int[26];
        Arrays.fill(preIndex, -1);
        for (int curI = 0;curI < str.length();curI++){
            int c = str.charAt(curI) - 'a';
            int preI = preIndex[c];
            if (preI == -1 || curI - preI > curLen){
                curI++;
            }

            else {
                maxLex = Math.max(maxLex, curLen);
                curLen = curI - preI;
            }
            preIndex[c] = curI;
        }
        maxLex = Math.max(maxLex, curLen);
        return maxLex;
    }

    public static void main(String[] args) {
        Test48 test48 = new Test48();
        System.out.println(test48.longestSubStringWithDuplication("arabvacftf"));
    }
}
