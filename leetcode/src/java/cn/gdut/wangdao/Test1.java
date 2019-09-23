package cn.gdut.wangdao;

public class Test1 {
    private int removeMin(int[] arr){
        int n = arr.length - 1;
        // 标记最小值。
        int k = 0;
        for (int i = 1 ;i< n;i++){
            // 如果当前的值比最小的还要小，则保存这个最小的下标。
            if (arr[i] < arr[k]){
                k = i;
            }
        }
        // 记录最小的值
        int minValue = arr[k];
        // 将最后一个元素替换
        arr[k] = arr[n];
        return minValue;
    }

    public static void main(String[] args) {
        int [] arr = {3,2,1,5,3,6};
        Test1 test1 = new Test1();
        System.out.println(test1.removeMin(arr));
        for (int x:arr
             ) {
            System.out.print(x);
        }
    }

}
