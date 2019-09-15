package cn.gdut.jianzhi;

public class Test24 {
    public ListNode ReverseList(ListNode head){
        if (head == null){
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode p = head, cur=null;
        newHead.next = cur;
        while (p != null){
            ListNode next = p.next;
            newHead.next = p;
            p.next = cur;
            cur = p;
            p = next;
        }
        return newHead.next;
    }
}
