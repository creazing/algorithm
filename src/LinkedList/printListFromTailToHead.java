package LinkedList;

import java.util.ArrayList;

/**
 * 问题：输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * 递归基是当节点为空，不进行操作
 */
public class printListFromTailToHead {
    private ArrayList<Integer> result = new ArrayList<Integer>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            result.add(listNode.val);
        }
        return result;
    }
}
