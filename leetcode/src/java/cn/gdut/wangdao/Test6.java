package cn.gdut.wangdao;

import java.util.Arrays;

public class Test6 {
    private int [] delete(int [] arr){
        int n = arr.length;
        int i = 0;
        for (int  j = 1; j < n;j++){
            if (arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        arr = Arrays.copyOfRange(arr, 0,i+1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5};
        Test6 test6  = new Test6();
        int[] arr1 = test6.delete(arr);
        for (int x:arr1
        ) {
            System.out.print(x);
        }
    }
}
