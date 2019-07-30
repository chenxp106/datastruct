package cn.gdut.leetcode.sousuo;

import cn.gdut.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Test257 {

    public List<String> binaryTreeNode(TreeNode root){
        List<String> paths = new ArrayList<>();
        if (root == null){
            return paths;
        }

        sole(root,"",paths);
        return paths;
    }

    private void sole(TreeNode root,String cur,List<String> ret){
        if (root == null){
            return;
        }
        cur += root.val;
        if (root.left == null && root.right == null){
            ret.add(cur);
        }
        else {
            sole(root.left,cur+"->",ret);
            sole(root.right,cur+"->",ret);
        }
    }

}
