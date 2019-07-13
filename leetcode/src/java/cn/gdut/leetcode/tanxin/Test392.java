package cn.gdut.leetcode.tanxin;

public class Test392 {
    public boolean isSubsequence(String s, String t) {
        char[] ss = s.toCharArray();
        char[] st = t.toCharArray();
        int sn = s.length();
        int tn = t.length();
        int j = 0;
        for (int i = 0;i<tn;i++){
            if (j<= sn-1 && ss[j] == st[i]){
                j++;
            }

        }
        if (j == sn){
            return true;
        }
        else {
            return false;
        }
    }
}
