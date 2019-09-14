package cn.gdut.jianzhi;

public class Test24 {
    public ListNode ReverseList(ListNode head){
        if (head == null){
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode p = head;
        ListNode h = null;
        newHead.next = h;
        while (p != null){
            ListNode next = p.next;
            newHead.next = p ;
            p.next = h;
            h = p;
            p = next;
        }
        return h;
    }
}
