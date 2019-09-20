package cn.gdut.jianzhi;

public class Test36 {
    private TreeNode pre = null;
    private TreeNode head = null;

    public TreeNode Conver(TreeNode pRootOfTree){
        inOrder(pRootOfTree);
        return head;
    }
    private void inOrder(TreeNode node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        node.left = pre;
        if (pre != null){
            pre.right = node;
        }
        pre = node;
        if (head == null){
            head =node;
        }
        inOrder(node.right);
    }
}
