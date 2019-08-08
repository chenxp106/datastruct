package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

public class Test110 {
    public boolean isBalanced(TreeNode root){
        maxDepth(root);
        return result;
    }

    private boolean result = true;

    private int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1){
            result = false;
        }
        return 1 + Math.max(l, r);
    }
}
