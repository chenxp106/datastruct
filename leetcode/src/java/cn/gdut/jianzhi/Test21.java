package cn.gdut.jianzhi;

public class Test21 {
    public void reOrderArray(int[] array) {
        // 奇数个数
        int oddCnt = 0;
        for (int x : array)
            if (!isEven(x))
                oddCnt++;
        int[] copy = array.clone();
        int i = 0, j = oddCnt;
        for (int num : copy) {
            if (num % 2 == 1)
                array[i++] = num;
            else
                array[j++] = num;
        }
    }

    private boolean isEven(int x) {
        return x % 2 == 0;
    }
}
