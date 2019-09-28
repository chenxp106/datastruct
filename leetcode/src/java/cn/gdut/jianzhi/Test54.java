package cn.gdut.jianzhi;

public class Test54 {

    private TreeNode ret = null;
    private int cnt ;

    public TreeNode KthNode(TreeNode pRoot, int k){
        inOrder(pRoot,k);
        return ret;
    }

    private void inOrder(TreeNode root, int k){
        if (root == null || cnt >= k){
            return;
        }
        inOrder(root.left, k);
        cnt++;
        if (cnt == k){
            ret = root;
        }
        inOrder(root.right, k);
    }
}
