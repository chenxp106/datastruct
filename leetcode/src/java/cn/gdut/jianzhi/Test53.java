package cn.gdut.jianzhi;

public class Test53 {
    public int GetNumberOfk(int [] array, int k){
        int first = binarySerach(array, k);
        int last =  binarySerach(array, k+1);
        return last - first;

    }
    private int binarySerach(int [] array, int k){
        int l  = 0;
        int h = array.length ;
        while (l<h){
            int mind = l + (h-l) / 2;
            if (array[mind] >=k){
                h=mind;
            }
            else {
                l = mind + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,3,4,5,5,5,6,6,6};
        Test53 test53 = new Test53();
        System.out.println(test53.GetNumberOfk(a,5));
    }

}
