package cn.gdut.wangdao;

import java.util.Arrays;

public class Test3 {
    private int[] removeX(int [] arr, int x){
        int n = arr.length;
        // 标记个数
        int cnt = 0;
        for (int i = 0; i<n;i++){
            // 累计x的个数
            if (arr[i] == x){
                cnt++;
            }
            // 否则，将后面的元素往前移动
            else {
                arr[i-cnt] = arr[i];
            }

        }
        return  arr = Arrays.copyOfRange(arr, 0, n - cnt);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5};
        Test3 test3  = new Test3();
        int[] arr1 = test3.removeX(arr,2);
        for (int x:arr1
        ) {
            System.out.print(x);
        }
    }
}
