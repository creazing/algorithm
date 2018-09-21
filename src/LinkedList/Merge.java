package LinkedList;

public class Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tmp.next = list1;
                list1=list1.next;
                tmp = tmp.next;
            }
            else{
                tmp.next = list2;
                list2=list2.next;
                tmp = tmp.next;
            }
        }
        if(list1 != null ){
            tmp.next = list1;
        }
        if(list2 != null){
            tmp.next = list2;
        }
        return result.next ;

    }}
