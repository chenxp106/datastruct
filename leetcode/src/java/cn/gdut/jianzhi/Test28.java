package cn.gdut.jianzhi;

public class Test28 {
    public boolean isSymmetrical(TreeNode pRoot){
        if (pRoot == null){
            return true;
        }
        return isSys(pRoot.left, pRoot.right);
    }

    private boolean isSys(TreeNode root1, TreeNode root2){
        // 都为空，返回true
        if (root1 == null && root2 == null){
            return true;
        }
        // 只有一个为空，返回false
        if (root1 == null || root2 == null){
            return false;
        }
        // 如果值不相等，返回false
        if (root1.val != root2.val){
            return false;
        }
        return isSys(root1.left, root2.right) && isSys(root1.right, root2.left);
    }


}
