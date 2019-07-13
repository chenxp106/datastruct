package cn.gdut.leetcode.tanxin;

public class Test605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        int a = flowerbed.length;
        for (int i = 0;i<a;i++){
            if (flowerbed[i] == 1){
                continue;
            }
            int pre = i == 0 ? 0 : flowerbed[i-1];
            int next = i == a -1 ? 0 : flowerbed[i+1];
            if (pre == 0 && next ==0){
                cnt++;
                flowerbed[i] = 1;
            }
        }
        return cnt>=n;
    }
}
