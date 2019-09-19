package cn.gdut.jianzhi;

public class Test33 {
    public boolean VerifySquenceOfBST(int [] sequence){
        if (sequence == null || sequence.length == 0){
            return false;
        }
        return verify(sequence, 0, sequence.length - 1);
    }
    private boolean verify(int [] sequence, int first, int last){
        // 递归出口
        if (last - first < 1){
            return true;
        }
        // 最后一个值，即是根节点
        int rootVal = sequence[last];
        // 定义第一个节点位置
        int curIndex = first;
        // 找到左子树的最后一个节点
        while (curIndex < last && sequence[curIndex] <= rootVal){
            curIndex++;
        }
        // 在右子树中找是否有比这个数小的元素，如果有则返回false、
        for (int i = curIndex ;i<last;i++){
            if (sequence[i] < rootVal){
                return false;
            }
        }
        // 递归查找
        return verify(sequence, first, curIndex - 1) && verify(sequence, curIndex,last-1);
    }
}
