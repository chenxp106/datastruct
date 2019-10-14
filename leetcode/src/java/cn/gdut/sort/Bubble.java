package cn.gdut.sort;

public class Bubble {
    /**
     * 从左到右不断交换相邻的元素。
     * 时间复杂度为O(n^2)
     * 空间复杂度为O(1)
     * 是一个稳定的排序算法
     * @param nums nums
     */
    public void sort(int [] nums){
        int n = nums.length;
        boolean isSorted = false;
        for (int i = n - 1;i > 0 && !isSorted;i--){
            // 轮训一次后还是有序，则退出不再判断
            isSorted = true;
            for (int j = 0; j<i;j++){
                if (nums[j] > nums[j+1]){
                    isSorted = false;
                    swap(nums, j,j+1);
                }
            }
        }
    }

    private void swap(int [] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Bubble bubble = new Bubble();
        int [] nums = {10,6,4,2,7,3,9};
        bubble.sort(nums);
        for (int n : nums){
            System.out.println(n);
        }

    }
}
