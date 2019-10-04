package cn.gdut.jianzhi;

public class Test55_2 {

    private boolean isBlance = true;
    public boolean IsBalanced_Solution(TreeNode root){
        height(root);
        return isBlance;
    }

    private int height(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1){
            isBlance = false;
        }
        return Math.max(left, right) + 1;

    }

}
