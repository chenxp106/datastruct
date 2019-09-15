package cn.gdut.jianzhi;

public class Test25 {
    public ListNode Merge(ListNode list1,ListNode list2){
        //其中有一个为空，返回另一个
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        // 新建一个头节点
        ListNode newHead = new ListNode(-1);
        ListNode p1 = list1, p2 = list2, cur = newHead;
        while (p1 != null && p2 != null){
            if (p1.val < p2.val){
                cur.next = p1;
                p1 = p1.next;
            }
            else {
                cur.next = p2;
                p2 = p2.next;
            }
            cur = cur.next;
        }
        if (p1 == null){
            cur.next = p2;
        }
        if (p2 == null){
            cur.next = p1;
        }
        return newHead.next;
    }
}
