package cn.gdut.jianzhi;

public class Test4 {
    public boolean Find(int target, int [][] array){
        // 先判空
        if (array == null || array.length == 0 || array[0].length == 0){
            return false;
        }
        int row = array.length - 1 ;
        int clow = array[0].length - 1;
        int i = 0;
        // 防止数组越界
        int j = clow;
        // 从右上角到左下角进行遍历
        while (i<=row && j>=0){
            // 如果找到这个值，则直接退出
            if (array[i][j] == target){
                return true;
            }
            // 如果target<arrar
            else if (target < array[i][j]){
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 20;
        Test4 test4 = new Test4();
        System.out.println(test4.Find(target, array));
    }
}
