package cn.gdut.jianzhi;

public class Test23 {
    public ListNode EntryNodeOfLoop(ListNode pHead){

        // 当只有一个节点或是链表为空的时候，直接返回null
        if (pHead == null || pHead.next == null){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        // 快慢指针分别移动
        do {
            fast = fast.next.next;
            slow = slow.next;
        }while (fast != slow);
        // 两个指针重叠，让快指针从头开始移动，而且每次只移动一步
        fast = pHead;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }
}
