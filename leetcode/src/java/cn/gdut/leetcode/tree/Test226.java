package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

public class Test226 {

    public TreeNode invertTree(TreeNode root){
        return deal(root);
    }

    private TreeNode deal(TreeNode root){
        if (root == null){
            return null;
        }
        // 现将一个节点保存下来
        TreeNode temp = root.left;
        root.left = deal(root.right);
        root.right = deal(temp);
        return root;
    }
}
