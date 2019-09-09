package cn.gdut.jianzhi;

public class Test17 {
    public void print1ToMaxOfNDigits(int n){
        if (n <= 0){
            return;
        }
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, 0);
    }

    private void print1ToMaxOfNDigits(char[] number, int digit){
        if (digit == number.length){
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10;i++){
            number[digit] = (char)(i + '0');
            print1ToMaxOfNDigits(number, digit + 1);
        }
    }

    private void printNumber(char[] number){
        int index = 0;
        while (index < number.length && number[index] == '0'){
            index++;
        }
        while (index < number.length){
            System.out.print(number[index++]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 1;
        Test17 test17 = new Test17();
        test17.print1ToMaxOfNDigits(n);
    }
}
