package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

public class Test543 {
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root){
        maxDeep(root);
        return max;
    }

    private int maxDeep(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = maxDeep(root.left);
        int right = maxDeep(root.right);
        max = Math.max(max, left + right);
        return Math.max(left,right) + 1;
    }

}
