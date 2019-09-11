package cn.gdut.jianzhi;

public class Test16 {
    public double Power(double base, int exponent){
        /*double a = 1;
        if ( exponent == 0){
            return 1;
        }
        else if (exponent > 0){
            for (int i = 0; i < exponent;i++){
                a = a * base;
            }
            return a;
        }
        else {
            for (int i = 0; i < Math.abs(exponent);i++){
                a = a / base;
            }
            return a;
        }*/
        // n == 0时，直接返回0
        if (exponent == 0){
            return 1;
        }
        if (exponent == 1){
            return base;
        }
        boolean isNegitave = false;
        if (exponent < 0){
            isNegitave = true;
            exponent = -exponent;
        }
        double pow  = Math.pow(base * base ,exponent / 2);
        if (exponent % 2 == 1){
            pow = base * pow;
        }
        return isNegitave ? 1 / pow : pow;
    }



}
