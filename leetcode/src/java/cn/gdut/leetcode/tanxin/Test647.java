package cn.gdut.leetcode.tanxin;


public class Test647 {
    private int cnt = 0;
    public int countSubstrings(String s){
        for (int i=0;i<s.length()-1;i++){
            //奇数
            isCon(s,i,i);
            //偶数
            isCon(s,i,i+1);
        }
        return cnt;
    }

    private void isCon(String s,int start,int end){
        while (start>=0 && end <s.length() && s.charAt(start) == s.charAt(end)){
            end++;
            start--;
            cnt++;
        }
    }
}
