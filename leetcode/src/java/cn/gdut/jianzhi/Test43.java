package cn.gdut.jianzhi;

public class Test43 {
    public int NumberOf1Beteen1AndN_Solution(int n){
        //1的个数
        int count = 0;

        //当前位
        int i = 1;

        int current, after, before;

        while((n/i)!= 0){

            //高位数字
            current = (n/i)%10;
            //当前位数字
            before = n/(i*10);
            //低位数字
            after = n-(n/i)*i;

            //如果为0,出现1的次数由高位决定,数量等于高位数字 * 当前位数
            if (current == 0) {
                count += before * i;
            } else if(current == 1) {
                //如果为1,出现1的次数由高位和低位决定,高位*当前位+低位+1
                count += before * i + after + 1;
            } else{
                //如果大于1,出现1的次数由高位决定,（高位数字+1）* 当前位数
                count += (before + 1) * i;
            }
            //前移一位
            i = i*10;
        }
        return count;
    }

    public static void main(String[] args) {
        Test43 test43 =new Test43();
        System.out.println(test43.NumberOf1Beteen1AndN_Solution(133));
    }
}
