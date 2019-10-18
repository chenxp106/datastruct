package cn.gdut.sort;

public class MergeSort {

    // 合并两个有序的数组
    private void merge(int[] nums, int l, int m, int h,int [] tmp){
        int i = l;
        int j = m+1;
        // tmp的下标
        int k = 0;
        while (i<=m && j <= h){
            if (nums[i] <= nums[j]){
                tmp[k++] = nums[i++];
            }
            else {
                tmp[k++] = nums[j++];
            }
        }
        // 将剩下的数补上
        while (i<=m){
            tmp[k++] = nums[i++];
        }
        while (j <= h){
            tmp[k++] = nums[j++];
        }
        // 将temp的数组赋值回给nums
        k = 0;
        while (l <= h){
            nums[l++] = tmp[k++];
        }
    }

    // 递归函数，
    private void sort(int [] nums, int l, int h,int [] temp){
        if (l < h){
            int m = (l+h) / 2;
            sort(nums,l, m,temp);
            sort(nums,m+1, h,temp);
            merge(nums, l, m, h, temp);
        }
    }

    // 创建一个数组用于调用sort。新建一个数组是为了在递归的时候不会重建创建数组，
    private void mergeSort(int [] nums){
        int [] tmp = new int[nums.length];
        sort(nums, 0, nums.length-1,tmp);
    }

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int [] nums = {6,5,4,3,2,1};
        sort.mergeSort(nums);
        for (int n :nums){
            System.out.println(n);
        }
    }


}
