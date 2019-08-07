package cn.gdut.leetcode.sort;

public class Selection<T extends Comparable<T>> extends Sort<T> {
    /**
     * 选择排序，从数组中选择最小的元素，将它与数组中的第一个元素交换位置。
     * 再从数组剩下的元素中选择出最小的元素，将它与数组中的第二个元素。
     * 不断进行这样的操作，直到将整个数组排序
     * @param nums
     */
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for (int i = 0;i<N - 1;i++){
            int min = i;
            for (int j = i+1;i<N;i++){
                if (less(nums[i],nums[j])){
                    j = min;
                }
            }
            swap(nums,i,min);
        }
    }
}

