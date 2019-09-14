package cn.gdut.jianzhi;

public class Test25 {
    public ListNode Merge(ListNode list1,ListNode list2){
        ListNode newHead = new  ListNode(-1);
        ListNode cur = newHead;
        // 循环两个链表
        while (list1 != null && list2 != null){
            ListNode p1 = list1;
            ListNode p2 = list2;
            // 如果大的，则将值连接到下面
            if (p1.val <= p2.val){
                list1 = list1.next;
                cur.next = p1;
                cur = p1 ;
            }
            // 否则，将另一个数连接下去
            else {
                list2 = list2.next;
                cur.next = p2;
                cur = p2;
            }
        }
        // 如果有一个不为空，将剩下的值连接上去
        if (list1 != null){
            cur.next = list1;
        }
        else {
            cur.next = list2;
        }

        return newHead.next;
    }
}
