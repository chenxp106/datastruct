package cn.gdut.jianzhi;

public class Test33 {
    public boolean VerifySquenceOfBST(int [] sequence){
       if (sequence == null || sequence.length == 0){
           return false;
       }
       return verify(sequence, 0, sequence.length-1);
    }

    private boolean verify(int []  sequence, int first, int last){

        if ((last - first )< 1){
            return true;
        }
        // 尾节点
        int rootVal = sequence[last];
        int curIndex = 0;
        // 找到左孩子
        while (sequence[curIndex] < rootVal){
            curIndex++;
        }
        // 判断右孩子
        for (int i = curIndex; i < last; i++){
            if (sequence[i] < rootVal){
                return false;
            }
        }
        return verify(sequence, first, curIndex) && verify(sequence, curIndex+1,last-1);

    }

}
