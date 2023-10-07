class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d = new ListNode(-1);
        ListNode current = d;
        while(list1!= null && list2!=null){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            } else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
        current.next = list1;
         } else {
        current.next = list2;
        }

    return d.next;    
    }
}
