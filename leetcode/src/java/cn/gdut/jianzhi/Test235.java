package cn.gdut.jianzhi;

public class Test235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root == null){
            return null;
        }
        if (root.val > p.val && root.val < q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if (root.val < p.val && root.val > q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
