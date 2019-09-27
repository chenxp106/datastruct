package cn.gdut.jianzhi;

public class Test53 {
    public int GetNumberOfk(int [] array, int k){

        int first = binarySearch(array,k);
        int last = binarySearch(array,k+1);
        return (first == array.length || array[first] != k) ? 0 : last - first;
    }

    private int binarySearch(int [] array, int k){
        int l = 0, h = array.length;
        while (l < h){
            int mid = l + (h - l)/ 2;
            if (k <= array[mid]){
                h = mid;
            }
            else {
                l = mid + 1;
            }
        }
        return l;
    }
}
