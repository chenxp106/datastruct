package cn.gdut.leetcode;

public class Test205 {
    public boolean isIsomorphic(String s, String t) {
        int[] preIndexS = new int[256];
        int[] preIndexT = new int[256];
        for (int i = 0;i<s.length();i++){
            char sc = s.charAt(i);
            char st = t.charAt(i);
            if (preIndexS[sc]!=preIndexT[st]){
                return false;
            }
            preIndexS[sc] = i+1;
            preIndexT[st] = i+1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "add";
        String t = "egg";
        Test205 test205 = new Test205();
        boolean d = test205.isIsomorphic(s, t);

    }
}
