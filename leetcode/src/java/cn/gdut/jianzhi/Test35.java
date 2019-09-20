package cn.gdut.jianzhi;

public class Test35 {
    public RandomListNode Clone(RandomListNode pHead){
        if (pHead == null){
            return null;
        }

        // 插入新节点
        RandomListNode cur = pHead;
        while (cur != null){
            // 赋值一个节点
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next = clone;
            cur = clone.next;
        }
        // 随机指针赋值

        cur = pHead;
        while (cur != null){
            RandomListNode clone = cur.next;
            if (cur.random != null){
                clone.random = cur.random.next;
            }
            cur = clone.next;
        }

        // 进行拆分
        cur = pHead;
        RandomListNode pCloneHead = pHead.next;
        while (cur.next != null){
            RandomListNode next = cur.next;
            cur.next = next.next;
            cur = next;
        }
        return pCloneHead;
    }
}
