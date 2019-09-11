package cn.gdut.jianzhi;

public class Test18_2 {
    public ListNode deleteDuplication(ListNode pHead){
        if (pHead == null){
            return null;
        }
        ListNode p = pHead;
        ListNode pre = new ListNode(-1);
        while (p.next != null){
            ListNode n = p.next;
            // 如果当前节点的值跟下一个节点的值不相等，则更新pre和p
            if (p.val != n.val){
                pre = p;
                p = n;
            }
            //相等
            else {
                while (p.val == n.val){
                    n = n.next;
                }
                // 如果是最后一个节点了。意思是前面的数都相等。将全部元素删除
                if (p == pHead){
                    pHead = n;
                }
                // 不是最后一个节点，正常删除
                else {
                    p = n;
                    pre.next = p;
                }
            }
        }
        return pHead;
    }
}
