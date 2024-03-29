package cn.gdut.jianzhi;

public class Test58_1 {
    public String ReverseSentence(String str){
        // 长度
        int n = str.length();
        char []  chars = str.toCharArray();
        // 单词的起始和结束为止
        int i = 0, j = 0;
        while (j <= n){
            if (j == n || chars[j] == ' '){
                reverse(chars, i,j-1);
                i = j+1;
            }
            j++;
        }
        reverse(chars, 0, n-1);
        return new String(chars);
    }

    private void reverse(char[] c, int i,int j){
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
