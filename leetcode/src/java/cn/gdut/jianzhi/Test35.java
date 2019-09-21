package cn.gdut.jianzhi;

public class Test35 {
    public RandomListNode Clone(RandomListNode pHead){

        if (pHead == null){
            return null;
        }
        // 插入节点
        RandomListNode cur = pHead;
        while (cur != null){
            RandomListNode tmp = new RandomListNode(cur.label);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }

        // 随机指针连接
        cur = pHead;
        while (cur != null){
            RandomListNode next = cur.next;
            if (cur.random != null){
                next.random = cur.random.next;
            }
            cur = next.next;
        }

        // 拆分链表
        cur = pHead;
        RandomListNode newHead = cur.next;
        while (cur.next != null){
            RandomListNode next = cur.next;
            cur.next = next.next;
            cur = next;
        }
        return newHead;
    }
}
