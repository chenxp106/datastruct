package cn.gdut.jianzhi;

public class Test4 {
    public boolean Find(int target, int [][] array){
        // 先判空
        if (array == null || array.length == 0 || array[0].length == 0){
            return false;
        }
        int r = array.length - 1;
        int c = array[0].length - 1;
        int i = c;
        int j = 0;
        while (i >= 0 && j<= r){
            if (target == array[j][i]){
                return true;
            }
            if (target < array[j][i]){
                i--;
            }
            else {
                j++;
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
        int target = 24;
        Test4 test4 = new Test4();
        System.out.println(test4.Find(target, array));
    }
}
