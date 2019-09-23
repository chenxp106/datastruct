package cn.gdut.jianzhi;

import java.util.ArrayList;

public class Test40 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k){
        ArrayList<Integer> ret = new ArrayList<>();
        if (k > input.length || k <= 0){
            return ret;
        }
        findKthSmallest(input, k -1);
        for (int i = 0; i < k; i++){
            ret.add(input[i]);
        }
        return ret;
    }

    // 找到前k个最小的值
    private void findKthSmallest(int [] nums, int k){
        int l = 0;
        int h = nums.length - 1;
        while (l < h){
            int  j = partition(nums, l, h);
            if (j == k){
                break;
            }
            if (j > k){
                h = j - 1;
            }
            else {
                l = j + 1;
            }
        }
    }

    private int partition(int [] nums, int l, int h){
        int p =  nums[l];
        int i = l, j = h + 1;
        while (true){
            while (i != h && nums[++i] < p);
            while (j != l && nums[--j] > p);
            if (i >= j){
                break;
            }
            swap(nums,i ,j);
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        Test40 test40 = new Test40();
        int []  a = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> ret = test40.GetLeastNumbers_Solution(a,4);
        System.out.println(ret);
     }
}
