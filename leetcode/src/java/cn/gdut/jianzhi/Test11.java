package cn.gdut.jianzhi;

public class Test11 {
    public int minNumberRotateArray(int [] array){
        // 先判空
        if (array.length == 0){
            return 0;
        }
        // 二分查找，一个是有序区间，一个是无序的。在无序的区间中查找
        int l = 0;
        int h = array.length - 1;
        while (l < h){
            int m = l + (h - l) / 2;
            // 当有重复元素时，如果中间和两边的数相等，则需要从头开始遍历
            if (array[l] == array[m] && array[m] == array[h]){
                return findMin(array, l, h);
            }
            else if (array[m] <= array[h]){
                h = m;
            }
            else {
                l = m + 1;
            }
        }
        return array[l];
    }

    private int findMin(int [] nums, int l, int h){
        for (int i = l;i<h;i++){
            if (nums[i] > nums[i+1]){
                return nums[i+1];
            }
        }
        return nums[l];
    }

}
