package cn.gdut.jianzhi;

public class Test27 {
    public void Mirror(TreeNode root){
        if (root == null){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
