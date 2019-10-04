package cn.gdut.jianzhi;

public class Test56 {
    public void FindNumsAppearOnce(int [] array, int num1 [], int num2[]){
        int diff = 0;
        for (int num : array){
            diff ^=num;
        }
        diff &= -diff;
        for (int num : array){
            if ((num & diff) == 0){
                num1[0] ^= num;
            }
            else {
                num2[0] ^=  num;
            }
        }
    }

    public static void main(String[] args) {
        Test56 test56 = new Test56();
        int[] a = {1,2,3,3};
        int b[] = {};
        int c[] = {};
        test56.FindNumsAppearOnce(a,b,c);
    }
}
