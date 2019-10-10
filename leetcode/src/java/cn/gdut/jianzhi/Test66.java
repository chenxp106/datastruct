package cn.gdut.jianzhi;

public class Test66 {
    public int [] nultipy(int [] A){
        if (A == null || A.length == 0){
            return null;
        }
        int n = A.length;
        int [] B1 = new int[n];
        int [] B2 = new int[n];
        int [] res = new int[n];
        B1[0] = 1;
        B2[n-1] = 1;
        for (int i = 1;i<n;i++){
            B1[i] = B1[i-1] * A[i-1];
        }
        for(int i = n-2;i >=0;i--){
            B2[i] = B2[i+1] * A[i+1];
        }
        for (int i = 0;i<n;i++){
            res[i] = B1[i] * B2[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        Test66 test66 = new Test66();
        int [] res = test66.nultipy(a);
        for (int n : res){
            System.out.println(n);
        }
    }
}
