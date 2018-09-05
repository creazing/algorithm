package LinkedList;

/**
 * 问题：在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * 思路：尾插法，依次找到单独的节点插入，如果重复则找出下一个
 */
public class deleteDuplication {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode result = new ListNode(0);
        ListNode newHead = result;
        //一次判断每个节点是否接入新的链表
        while(pHead != null){
            if(pHead.next == null || pHead.next.val != pHead.val){
                newHead.next = pHead;
                newHead = newHead.next;
                pHead = pHead.next;
            }
            else{
                ListNode node = pHead.next;
                //找到第一个和当前节点不一样的节点
                while(node != null){
                    if(node.val != pHead.val)
                        break;
                    node = node.next;
                }
                pHead = node;
            }
        }
        newHead.next = null;
        return result.next;

    }
}
