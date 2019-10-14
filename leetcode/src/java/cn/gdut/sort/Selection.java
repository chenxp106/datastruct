package cn.gdut.sort;

public class Selection {
    public void sort(int [] nums){
        int n = nums.length;
        for (int i = 0;i<n-1;i++){
            //定义最小的一个
            int k = i;
            for (int j = i+1; j < n;j++){
                if (nums[j] < nums[k]){
                    k = j;
                }
            }
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
