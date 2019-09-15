package cn.gdut.jianzhi;

public class Test22 {
    public ListNode FindKthToTail(ListNode head, int k){
        if (head == null){
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        while (p1 != null && k-- > 0){
            p1 = p1.next;
        }
        // 如果p1到达最末尾，
        if ( k > 0){
            return null;
        }
        while (p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
