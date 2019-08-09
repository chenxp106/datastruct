package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

public class Test110 {

    private boolean result = true;
    public boolean isBalanced(TreeNode root){
        maxDeep(root);
        return result;
    }

    private int maxDeep(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = maxDeep(root.left);
        int right = maxDeep(root.right);
        // 计算两个节点的高度差
        int diff = Math.abs(right-left);
        if (diff > 1){
            result = false;
        }
        return Math.max(left, right) + 1;
    }
}
