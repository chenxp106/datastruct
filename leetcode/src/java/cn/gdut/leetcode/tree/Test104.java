package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

public class Test104 {
    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int max = Math.max(left, right);
        return max+1;
    }
}
