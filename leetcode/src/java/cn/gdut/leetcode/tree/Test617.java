package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

public class Test617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if (t1 == null && t1 == null){
            return null;
        }
        // 如果t1为空，返回t2，如果t2为空，返回t1
        if (t1 == null){
            return t2;
        }
        if (t2 == null ){
            return t1;
        }
        // 新建一个节点
        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);
        return root;
    }
}
