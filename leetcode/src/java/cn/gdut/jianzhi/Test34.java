package cn.gdut.jianzhi;

import java.util.ArrayList;

public class Test34 {

    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){

        if (root == null){
            return ret;
        }
        track(new ArrayList<>(), root, target);
        return ret;
    }

    private void track(ArrayList<Integer> path, TreeNode node, int target){
        if (node == null){
            return;
        }
        path.add(node.val);
        target = target - node.val;
        if (idLeaf(node) && target == 0){
            ret.add(new ArrayList<>(path));
        }
        else {
            track(path, node.left, target);
            track(path, node.right, target);
        }

        path.remove(path.size() - 1);

    }

    private boolean idLeaf(TreeNode node){
        if (node.left ==null && node.right == null){
            return true;
        }
        return false;
    }


}
