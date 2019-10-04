package cn.gdut.jianzhi;

import java.util.ArrayList;

public class Test57_2 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        int start = 1, end = 2;
        int curSum = 3;
        while (end < sum){
            if (curSum > sum){
                curSum -= start;
                start++;
            }
            else if (curSum < sum){
                end++;
                curSum += end;
            }
            else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = start;i <= end;i++){
                    list.add(i);
                }
                ret.add(list);
                curSum -= start;
                start++;
                end++;
                curSum += end;
            }
        }
        return ret;

    }

    public static void main(String[] args) {
        Test57_2 test57_2 = new Test57_2();
        System.out.println(test57_2.FindContinuousSequence(100));
    }
}
