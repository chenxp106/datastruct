package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

public class Test572 {
    public boolean isSubtree(TreeNode s, TreeNode t){
        if (s == null){
            return false;
        }
        return isSubtreewithRoot(s,t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSubtreewithRoot(TreeNode s, TreeNode t){
        if (t == null && s == null){
            return true;
        }
        if (t == null || s == null){
            return false;
        }
        if (t.val != s.val){
            return false;
        }
        return isSubtreewithRoot(s.left, t.left) && isSubtreewithRoot(s.right, t.right);
    }
}
