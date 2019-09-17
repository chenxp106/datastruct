package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test32_1 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        queue.add(root);
        while ( !queue.isEmpty()){
            TreeNode cur = queue.poll();
            if (cur != null) {
                ret.add(cur.val);
                if (cur.left != null){
                    queue.add(cur.left);
                }
                if (cur.right != null){
                    queue.add(cur.right);
                }
            }
        }
        return ret;
    }
}
