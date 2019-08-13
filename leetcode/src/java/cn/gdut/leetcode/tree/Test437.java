package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

public class Test437 {
    int pathNumber;
    public int pathSum(TreeNode root, int sum){
        if (root == null){
            return 0;
        }
        startWithRoot(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right,sum);
        return pathNumber;
    }

    private void startWithRoot(TreeNode root, int sum){
        if (root == null){
            return;
        }
        sum -= root.val;
        if (sum == 0){
            pathNumber++;
        }
        startWithRoot(root.left,sum);
        startWithRoot(root.right, sum);
    }

}
