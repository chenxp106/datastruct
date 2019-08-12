package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

public class Test734 {
    public int pathSum(TreeNode root, int sum){
        if (root == null){
            return 0;
        }
        int ret = startWithRoot(root, sum) + startWithRoot(root.left, sum) + startWithRoot(root.right ,sum);
        return ret;

    }

    public int startWithRoot(TreeNode root, int sum){
        if (root == null){
            return 0;
        }
        int ret = 0;
        if (root.val == sum){
            ret++;
        }
        ret += startWithRoot(root.left, sum - root.val) + startWithRoot(root.right, sum - root.val);
        return ret;
    }

}
