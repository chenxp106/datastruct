package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ListNode head = new ListNode(-1);
        while (listNode != null){
            ListNode tmp = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = tmp;
        }
        ArrayList<Integer> list = new ArrayList<>();
        head = head.next;
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        return list;
    }
}
