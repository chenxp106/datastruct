package cn.gdut.jianzhi;

public class Test3 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null || length <= 0 ){
            return false;
        }
        // 遍历每一个元素
        for (int i = 0;i<length;i++){
            while (i != numbers[i]){
                // 如果相等，则说明有重复元素，将重复元素保存下来
                if (numbers[i] == numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }
                // 不相等，则交换两个元素
                swap(numbers,i, numbers[i]);
            }
        }
        return false;
    }
    private void swap(int[] nums, int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}
