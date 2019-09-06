package cn.gdut.jianzhi;

public class Test11 {
    public int minNumberRotateArray(int [] array){
        if (array.length == 0){
            return 0;
        }
        int l = 0;
        int h = array.length - 1;
        while (l < h){
            int m = l + (h - l) / 2;
            // 如果三个元素都相等，则不能找到哪个是最小的。此时需要顺序查找
            if (array[l] == array[m] && array[l] == array[h]){
                return minNumber(array, l, h);
            }
            // 非递减
            else if (array[m] <= array[h]){
                h = m;
            }
            else {
                l = m + 1;
            }
        }
        return array[l];
    }

    private int minNumber(int [] nums, int l, int h){
        for (int i = l;i<h;i++){
            if (nums[i] > nums[i+1]){
                return nums[i+1];
            }
        }
        return nums[l];
    }
}
