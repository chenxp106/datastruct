package cn.gdut.wangdao;

public class Test2 {
    private void reverse(int [] arr){
        int n = arr.length;
        int low = 0;
        int high = n -1;
        // 从两边向中间扫描
        while (low <= high){
            int t = arr[low];
            arr[low] = arr[high];
            arr[high] = t;
            low++;
            high--;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Test2 test2  = new Test2();
        test2.reverse(arr);
        for (int x:arr
             ) {
            System.out.print(x);
        }
    }
}
