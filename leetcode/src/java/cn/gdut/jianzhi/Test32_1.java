package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test32_1 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        if (root == null ){
            return null;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty()){
            TreeNode cur = queue.poll();
            ret.add(cur.val);
            if (cur.left != null){
                queue.add(cur.left);
            }
            if (cur.right != null){
                queue.add(cur.right);
            }
        }
        return ret;
    }
}
