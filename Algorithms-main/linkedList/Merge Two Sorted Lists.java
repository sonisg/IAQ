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


Algo:
create res ll.
Check for less val till both the values are null and add accordingly.
add the left values to result as it is.


Time complexity:
O(m+n)

