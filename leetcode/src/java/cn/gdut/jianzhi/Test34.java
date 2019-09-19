package cn.gdut.jianzhi;

import java.util.ArrayList;

public class Test34 {
    //定义全局变量
    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){
        track(root, target, new ArrayList<>());
        return ret;
    }

    private void track( TreeNode root, int target, ArrayList<Integer> path){
        if (root == null ){
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (isLeft(root) && target == 0){
            ret.add(new ArrayList<>(path));
        }
        else {
            track(root.left, target, path);
            track( root.right, target ,path);
        }
        path.remove(path.size() - 1);

    }

    private boolean isLeft(TreeNode root){
        if (root.left == null && root.right == null){
            return true;
        }
        return false;
    }
}
