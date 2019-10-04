package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.Arrays;

public class Test57_1 {
    public ArrayList<Integer> FindNumberWithSum(int [] array,int sum){
        int l = 0;
        int h = array.length - 1;
        while (l < h){
            int cur = array[l] + array[h];
            if (cur == sum){
                return new ArrayList<>(Arrays.asList(array[l],array[h]));
            }
            //
            else if (cur > sum){
                h--;
            }
            else {
                l++;
            }
        }
        return new ArrayList<>();
    }
}
