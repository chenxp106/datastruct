package cn.gdut.sort;

public class Selection {
    public void sort(int [] nums){
        // 选择第一个作为当前最小的值
        int n = nums.length;
        for (int i = 0;i < n-1;i++){
            // 零当前的i为最小值。
            int k = i;
            for (int j = i+1; j < n;j++){
                // 选出本次循环的最小值的下标赋值给k
                if (nums[j] < nums[k]){
                    k = j;
                }
            }
            // 当前值与k交换
            swap(nums, i, k);
        }
    }

    private void swap(int [] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Selection selection = new Selection();
        int [] nums = {6,4,2,7,3,9};
        selection.sort(nums);
        for (int n : nums){
            System.out.println(n);
        }

    }
}
