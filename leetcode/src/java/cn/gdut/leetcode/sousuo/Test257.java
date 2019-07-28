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
        List<Integer> values = new ArrayList<>();
        tracting(root,paths,values);
        return paths;

    }

    private void tracting(TreeNode root,List<String> paths,List<Integer> values){
        if (root == null){
            return;
        }
        // 将值添加到val中
        values.add(root.val);
        // 如果是叶子节点，则直接建立路径并返回
        if (isLeft(root)){
            paths.add(buildPath(values));
        }
        // 否则，递归
        tracting(root.left,paths,values);
        tracting(root.right,paths,values);
        // 将该值从values中移除
        values.remove(values.size() - 1);

    }

    private boolean isLeft(TreeNode root){
        return root.left == null && root.right == null;
    }

    private String buildPath(List<Integer> values){
        StringBuilder str = new StringBuilder();
        for (int i = 0;i<values.size();i++){
            str.append(values.get(i));
            if (i != values.size() -1){
                str.append("->");
            }
        }
        return str.toString();
    }
}
