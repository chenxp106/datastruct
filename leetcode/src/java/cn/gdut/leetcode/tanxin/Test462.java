package cn.gdut.leetcode.tanxin;

public class Test462 {
    public int minMoves2(int[] nums) {
        int move = 0;
        //找到中位数
        int media = findKthSmalist(nums,nums.length / 2);
        for(int num : nums){
            move += Math.abs(num - media);
        }
        return move;
    }

    //找到中位数
    private int findKthSmalist(int[] nums,int k){
        int l = 0;
        int h = nums.length - 1;
        while (l <h){
            int j = partions(nums,l,h);
            if (j == k){
                break;
            }
            if (j<k){
                l = j+1;
            }
            else {
                h = j-1;
            }
        }
        return nums[k];
    }

    //快速排序的下标
    private int partions(int[] nums,int l,int h){
        int i = l;
        int j = h+1;
        while (true){
            while (nums[++i]<nums[l] && i<h);
            while (nums[--j]>nums[l] && j>l);
            if (i>=j){
                break;
            }
            swap(nums,i,j);
        }
        swap(nums,l,j);
        return j;
    }


    private void swap(int[] nums,int i,int j){
        int tmp;
        tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}
