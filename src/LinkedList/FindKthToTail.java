package LinkedList;

/**
 * 问题：输入一个链表，输出该链表中倒数第k个结点。
 * 思路：利用双指针，第一个先指向K个节点，当第一个叨叨尾时第一个指针到倒数第K个
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode pre = head;
        if(head == null || k==0)
            return null;
        for(int i = 1 ; i<k;++i){
            if(pre.next != null)
                pre = pre.next;//指向第K个节点
            else
                return null;
        }
        ListNode last = head;
        while(pre.next != null){
            pre = pre.next;
            last = last.next;
        }
        return last;
    }
}
