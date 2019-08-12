package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

public class Test112 {
    public boolean hasPathSum(TreeNode root, int sum){
        if (root == null){
            return false;
        }
        if (root.left == null && root.right == null && sum == 0){
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
