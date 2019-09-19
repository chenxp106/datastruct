package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Test32_3 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (pRoot == null){
            return ret;
        }
        boolean reverse = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            while (size-- >0){
                TreeNode cur = queue.poll();
                if (cur == null){
                    continue;
                }
                list.add(cur.val);
                queue.add(cur.left);
                queue.add(cur.right);
            }
            if (reverse){
                Collections.reverse(list);
            }
            reverse = !reverse;
            if (list.size() != 0){
                ret.add(list);
            }

        }
        return ret;
    }

}
