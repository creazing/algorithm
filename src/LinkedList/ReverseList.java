package LinkedList;

/**
 * 问题：反转链表
 * 递归：递归基是最后一个节点，访问的节点指向空，下一个节点指向它
 * 迭代：三个指针
 */
public class ReverseList {
    public ListNode ReverseList1(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode newHead = ReverseList(head.next);
        head.next.next = head;//
        head.next = null;
        return newHead;
    }

    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode pre = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }
}
