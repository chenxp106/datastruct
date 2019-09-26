package cn.gdut.jianzhi;

public class Test44 {
    public int getDigitAtIndex(int index){
        if (index < 0){
            return -1;
        }
        // 表示哪位1表示个数。2表示十位
        int place = 1;
        while (true){
            int amount = getAmountOfPlace(place);
            int totalAmout = amount * place;
            if (index < totalAmout){
                return getDigitAtIndex(index, place);
            }
            index -= totalAmout;
            place++;
        }

    }

    private int getAmountOfPlace(int place){
        if (place ==1){
            return 10;
        }
        return (int) Math.pow(10, place - 1) * 9;
    }

    private int getDigitAtIndex(int index, int place){
        int beginNumber = getBeginNumberOfPlace(place);
        int shiftNumber = index / place;
        String number = (beginNumber + shiftNumber) + "";
        int count = index % place;
        return number.charAt(count) - '0';
    }

    private int getBeginNumberOfPlace(int place){
        if (place == 1){
            return 0;
        }
        return (int) Math.pow(10, place - 1);
    }

    public static void main(String[] args) {
        Test44 test44 = new Test44();
        System.out.println(test44.getDigitAtIndex(1001));
    }
}
