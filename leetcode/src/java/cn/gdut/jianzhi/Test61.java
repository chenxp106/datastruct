package cn.gdut.jianzhi;

import java.util.Arrays;

public class Test61 {
    public boolean isContinuous(int [] numbers){

        if (numbers.length < 5){
            return false;
        }

        Arrays.sort(numbers);
        // 统计癞子个数
        int cnt = 0;
        for (int n :numbers){
            if(n == 0){
                cnt++;
            }
        }

        // 使用癞子去不全不连续的 顺子
        for (int i = cnt;i < numbers.length - 1;i++){
            if (numbers[i+1] == numbers[i]){
                return false;
            }
            cnt -= numbers[i+1] - numbers[i] - 1;
        }

        return cnt >= 0;

    }
}
