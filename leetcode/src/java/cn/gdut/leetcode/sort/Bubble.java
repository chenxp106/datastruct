package cn.gdut.leetcode.sort;

public class Bubble<T extends  Comparable<T>> extends Sort<T>{

    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = N -1 ;i>0;i--){
            for (int j = 0;j<N;j++){
                if (less(nums[j+1], nums[j])){
                    swap(nums,j,j+1);
                }
            }
        }
    }
}