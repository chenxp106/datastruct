package cn.gdut.jianzhi;

public class Test8 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        // 当节点有右子树时，下一节点为右子树的最左的子树
        if (pNode.right != null){
            TreeLinkNode node = pNode.right;
            while (node.left != null){
                node  = node.left;
            }
            return node;
        }
        // 否则，继续往上找父节点
        else {
            while (pNode.next != null){
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode){
                    return parent;
                }
                pNode = pNode.next;
            }
        }
        return null;
    }
}
