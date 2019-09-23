package cn.gdut.jianzhi;

/**
 * 找到个数大于一般的数
 */
public class Test39 {
    public int MoreThanHalfNum_solution(int [] array){
        int marjor = array[0];
        int cnt = 1;
        for (int i = 1 ;i < array.length; i++){
            if (marjor == array[i]){
                cnt++;
            }
            else {
                cnt--;
            }
            if (cnt == 0){
                marjor = array[i];
                cnt=1;
            }
        }
        cnt = 0;
        for (int x : array){
            if (marjor == x){
                cnt++;
            }
        }
        return cnt > array.length / 2 ? marjor : 0;
    }
}
