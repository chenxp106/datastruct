package cn.gdut.sort;

public class Insertion {
    public void sort(int [] nums){
        int n = nums.length;
        for (int i = 1;i<n;i++){
            for (int j = i;j>0 && (nums[j] < nums[j-1]);j--){
                swap(nums, j,j-1);
            }
        }
    }
    private void swap(int [] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Insertion insertion = new Insertion();
        int [] nums = {10,6,4,2,7,3,9};
        insertion.sort(nums);
        for (int n : nums){
            System.out.println(n);
        }

    }

}
