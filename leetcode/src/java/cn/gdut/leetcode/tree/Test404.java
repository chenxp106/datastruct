package cn.gdut.leetcode.tree;

import cn.gdut.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Test404 {
    public int sumOfLeftLeaves(TreeNode root){
        Queue<TreeNode>  q = new LinkedList<>();
        q.add(root);
        int sum = 0;
        while (q.peek() != null){
            TreeNode r = q.poll();
            if (r.left != null){
                q.add(r.left);
                if (isLeft(r.left)){
                    sum += r.left.val;
                }
            }
            if (r.right != null){
                q.add(r.right);
            }

        }
        return sum;
    }

    private boolean isLeft(TreeNode node){
        if (node == null){
            return false;
        }
        return node.left == null && node.right == null;
    }

}
