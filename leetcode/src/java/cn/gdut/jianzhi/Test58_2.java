package cn.gdut.jianzhi;

public class Test58_2 {
    public String LeftRotateString(String str, int n){
        if (str == null || str.length() == 0){
            return "";
        }
        char [] chars = str.toCharArray();
        int len = chars.length;
        reverse(chars, 0,n-1);
        reverse(chars, n, len-1);
        reverse(chars, 0, len-1);
        return new String(chars);
    }

    private void reverse(char [] c, int i,int j){
        while (i<j){
            swap(c,i++,j--);
        }
    }

    private void swap(char [] c, int i, int j){
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
    }
}
