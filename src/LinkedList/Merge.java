package LinkedList;

public class Merge {
    public static ListNode Merge(ListNode list1,ListNode list2) {
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
        while(list1 != null ){
            tmp.next = list1;
            list1=list1.next;
            tmp = tmp.next;
        }
        while(list2 != null){
            tmp.next = list2;
            list2=list2.next;
            tmp = tmp.next;
        }
        return result.next ;

    }
}
