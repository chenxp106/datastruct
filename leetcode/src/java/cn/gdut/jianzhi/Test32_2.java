package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test32_2 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (pRoot == null){
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (size-- > 0){
                TreeNode cur = queue.poll();
                if (cur == null)
                    continue;
                list.add(cur.val);
                queue.add(cur.left);
                queue.add(cur.right);

            }
            if (list.size() != 0){
                ret.add(list);
            }
        }
        return ret;
    }
}
