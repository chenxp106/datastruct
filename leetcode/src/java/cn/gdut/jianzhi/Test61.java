package cn.gdut.jianzhi;

import java.util.Arrays;

public class Test61 {
    public boolean isContinuous(int [] numbers){

        if (numbers == null || numbers.length == 0){
            return false;
        }

        // 先排序
        Arrays.sort(numbers);
        int cnt = 0;
        // 统计0的个数
        for (int num : numbers){
            if (num == 0){
                cnt++;
            }
        }
        // 将不完整的补上
        for (int i = cnt;i < numbers.length - 1; i++){
            if (numbers[i+1] == numbers[i]){
                return false;
            }
            cnt -= numbers[i+1] - numbers[i] - 1;
        }
        return cnt >= 0;
    }

    public static void main(String[] args) {
        Test61 test61 = new Test61();
        int [] a = {1,2,3,4,5};
        System.out.println(test61.isContinuous(a));
    }

}
