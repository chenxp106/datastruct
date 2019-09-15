package cn.gdut.jianzhi;

public class Test21 {
    public void reOrderArray(int[] array) {
        // 奇数的个数
        int oddCnt = 0;
        int[] copy = array.clone();
        for (int i = 0; i < array.length; i++){
            if (!isEven(array[i])){
                oddCnt++;
            }
        }
        // 从0开始存放偶数，
        int i = 0;
        // 从j开始存放偶数
        int j = oddCnt;
        for (int k = 0; k<copy.length;k++){
            if (!isEven(copy[k])){
                array[i++] = copy[k];
            }
            else {
                array[j++] = copy[k];
            }
        }

    }

    private boolean isEven(int x) {
        return x % 2 == 0;
    }
}
