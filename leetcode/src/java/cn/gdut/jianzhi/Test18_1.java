package cn.gdut.jianzhi;

public class Test18_1 {
    public ListNode deleteNode(ListNode head , ListNode tobeDelete){
        // 先判空
        if (head == null || tobeDelete == null){
            return null;
        }
        // 两种情况，不是最后一个节点的时候。将后面的值赋值给当前的值，并且删除后面那个值
        if (tobeDelete.next != null){
            ListNode n = tobeDelete.next;
            tobeDelete.val = n.val;
            tobeDelete.next = n.next;
        }
        // 当为最后一个节点的时候,找到倒数第二个节点，并将最后一个节点删除
        else {
            // 当只有一个节点的时候
            if (head == tobeDelete){
                head = null;
            }
            else {
                ListNode p = head;
                while (p.next != tobeDelete){
                    p = p.next;
                }
                p.next = null;
            }
        }
        return head;

    }
}
