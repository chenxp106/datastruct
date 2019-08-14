package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

public class Test572 {
    public boolean isSubtree(TreeNode s, TreeNode t){
       if (s == null){
           return false;
       }
       return isSubtr(s,t) || isSubtr(s.left,t) || isSubtr(s.right, t);

    }

    public boolean isSubtr(TreeNode s, TreeNode t){
        // 都为空，则返回true
        if (s == null && t == null){
            return true;
        }
        // 有一个不为空，返回false
        if (s == null || t == null){
            return false;
        }
        // 都不为空, 判断值是否相等
        if (s.val != t.val){
            return false;
        }
        // 递归左右子树
        return  isSubtr(s.left,t.left) && isSubtr(s.right, t.right);
    }

}
