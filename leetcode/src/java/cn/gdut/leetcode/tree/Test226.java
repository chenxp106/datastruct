package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

public class Test226 {

    public TreeNode invertTree(TreeNode root){
        return deal(root);
    }

    private TreeNode deal(TreeNode root){
        if (root == null){
            return root;
        }
        TreeNode temp = root.right;
        root.right = deal(root.left);
        root.left = deal(temp);
        return root;
    }
}
