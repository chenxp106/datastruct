package cn.gdut.sort;

public class Quick {

    /**
     * 对nums中l到k的元素排序
     * @param nums nums
     * @param l 起始下标
     * @param h 终止下标
     */
    private void quickSort(int [] nums,int l, int h){
        int i = l;
        int j = h;
        int tmp;
        // 说明至少存在两个元素
        if (l < h){
            // 用区间的第一个元素作为基准
            tmp = nums[l];
            // 从区间两端交替扫描，知道j=j
            while (i != j){
                // 从右往左扫，找到第一个小于temp的num[j]
                while (j > i && nums[j] < tmp){
                    j--;
                }
                // 找到了这样num[j]，num[i] <-> num[j]
                nums[i] = nums[j];
                // 从左往右扫，找到第一个大于tmp的num[i]
                while (i < j && nums[j] > tmp){
                    i++;
                }

                nums[j] = nums[i];
            }
            // 将tmp放回到空出来的位置山
            nums[i] = tmp;
            // 对左边区间排序
            quickSort(nums, l, i-1);
            quickSort(nums, i+1, h);
        }

    }

    public void sort(int [] nums){
        quickSort(nums, 0, nums.length);
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
