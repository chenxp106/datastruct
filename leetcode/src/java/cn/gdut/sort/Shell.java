package cn.gdut.sort;

public class Shell {
    public void sort(int [] nums){
        int n = nums.length;
        int h = n /2;
        while (h >= 1){
            for (int i = h;i<n;i++){
                for (int j = i;j>=h && (nums[j] < nums[j-h]);j-=h){
                    swap(nums, j, j-h);
                }
            }
            h= h/2;
        }

    }

    private void swap(int [] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Shell shell = new Shell();
        int [] nums = {6,5,4,3,2,1};
        shell.sort(nums);
        for (int n : nums){
            System.out.println(n);
        }

    }
}
