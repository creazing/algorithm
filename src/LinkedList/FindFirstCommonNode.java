package LinkedList;

/**
 * 问题：输入两个链表，找出它们的第一个公共结点。
 * 思路：两个链表的长度，求出差然后差额行走
 */
public class FindFirstCommonNode {
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = 0 ,len2 = 0;
        ListNode node = pHead1;
        while(node != null){
            node=node.next;
            len1++;
        }
        node = pHead2;
        while(node != null){
            node=node.next;
            len2++;
        }
        ListNode node1 = pHead1;
        ListNode node2 = pHead2;
        int len = len1 - len2;//默认len1大于len2
        if(len2 - len1 > 0 ){
            len = len2 -len1;
            node1 = pHead2;
            node2 = pHead1;
        }
        while(len > 0){
            node1 = node1.next;
            len--;
        }
        while(node1 != null){
            if(node1 == node2)
                return node1;
            node1 = node1.next;
            node2 = node2.next;
        }
        return null;
    }
}
