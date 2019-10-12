package cn.gdut.jianzhi;

public class Test67 {
    public int StrToInt(String str){
        // +1234 输出12345
        if (str == null || str.length() == 0){
            return 0;
        }
        // 正负号
        boolean isNegtive = str.charAt(0) == '-';
        int res = 0;
        int t = 0;
        for (int i = 0; i < str.length() ; i++){
            // 获取当前字符
            char c = str.charAt(i);
            // 判断第一个字符
            if (i == 0 && (c == '+' || c == '-')){
                continue;
            }
            // 获取当前的字母
            if (c > '0' && c < '9'){
                t = c - '0';
            }
            else {
                return 0;
            }
            // 结果
            res = res * 10 + t;
            if (res > Integer.MAX_VALUE){
                throw new RuntimeException("上溢出");
            }
            if (res < Integer.MIN_VALUE){
                throw new RuntimeException("下溢出");
            }
        }
        // 判断结果的正负
        return isNegtive ? -res : res;

    }
}
