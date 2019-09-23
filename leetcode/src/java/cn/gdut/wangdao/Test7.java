package cn.gdut.wangdao;

public class Test7 {
    private int[] add(int [] arr1, int [] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        // 新建一个数组
        int [] arr3 = new int[n1+n2];
        int i = 0;
        int j = 0;
        int k = 0;
        // 遍历两个数组,并将更小的数加到arr3中
        while (i < n1 && j < n2){
            if (arr1[i] <= arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }
            else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        // 将剩下的接到后面
        while (i<n1){
            arr3[k++] = arr1[i++];;
        }
        while (j < n2){
            arr3[k++] = arr2[j++];
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,2,3,4,8};
        Test7 test7 = new Test7();
        int [] aa= test7.add(arr1,arr2);
        for (int x:aa
             ) {
            System.out.println(x);
        }
    }
}
