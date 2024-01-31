class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(-1);
        ListNode curr = res;
        int c = 0;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr= curr.next;
        }
        if(list1!=null){
            curr.next=list1;
        } else {
            curr.next=list2;
        }
         return res.next;
    }
}

Algo:
Check list1 and list2 value and add accordingly to result.

TC: O(M+N);
