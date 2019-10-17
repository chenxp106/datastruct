package cn.gdut.sort;

public class MergeSort {

    //合并两个链表
    private void merge(int [] nums, int l, int m, int h,int [] temp){
        int i = l;
        int j = m + 1;
        int t = 0;
        while (i<=m && j<=h){
            if (nums[i] <= nums[j]){
                temp[t++] = nums[i++];
            }
            else {
                temp[t++] = nums[j++];
            }


        }
        // 将剩下的部分方法哦temp中
        while (i<=m){
            temp[t++] = nums[i++];
        }
        while (j<=h){
            temp[t++] = nums[j++];
        }
        // 将temp赋值回给num中
        for (i = 0;i<t;i++){
            nums[l+i] = temp[i];
        }
    }

    public void sort(int [] nums, int l, int h, int [] temp){
        if (l < h){
            int m = (l + h) / 2;
            sort(nums,l,m,temp);
            sort(nums,m+1,h,temp);
            merge(nums, l, m,h,temp);
        }
    }

    public void sort(int [] nums){
        int [] temp = new int[nums.length];
        sort(nums, 0, nums.length-1, temp);
    }

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int [] nums = {6,5,4,3,2,1};
        sort.sort(nums);
        for (int n :nums){
            System.out.println(n);
        }
    }


}
