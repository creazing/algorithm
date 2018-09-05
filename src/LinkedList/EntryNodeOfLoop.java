package LinkedList;

/**
 * 问题：给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        //判断是否有环且得到两个节点相遇的节点
        ListNode node1 = pHead;
        ListNode node2 = pHead;
        while(node2.next != null && node2.next.next!=null){
            if(node1 == node2)
                break;
            node1 = node1.next;
            node2 = node2.next.next;
        }
        if(node2.next == null || node2.next.next == null)
            return null;
        //求出环的长度
        int len = 0;
        do{
            node1 = node1.next;
            node2 = node2.next.next;
            len++;
        }while(node1.next != node2.next);
        //得出环的入口
        node1 = pHead;
        node2 = pHead;
        for(int i = 0;i<len;i++){
            node2 = node2.next;
        }
        while(node1 != node2){
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }
}
