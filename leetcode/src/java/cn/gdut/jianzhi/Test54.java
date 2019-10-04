package cn.gdut.jianzhi;

public class Test54 {

    private TreeNode ret = null;

    private int cnt = 0;

    public TreeNode KthNode(TreeNode pRoot, int k){
        inOrder(pRoot,k);
        return ret;
    }

    private void inOrder(TreeNode root, int k){
        if (root == null){
            return;
        }
        inOrder(root.left, k);
        if (cnt < k){
            cnt++;
        }
        if (cnt == k){
            ret = root;
        }
        inOrder(root.right,k);
    }


}
