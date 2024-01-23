class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                cur.next = list1;
                list1=list1.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1!=null){
            cur.next=list1;
        } else {
            cur.next=list2;
        }
         return res.next;  
    }
}

Algo:
The algorithm traverses through both input linked lists (list1 and list2) simultaneously in a single while loop.
In each iteration, it compares the values of the current nodes in list1 and list2.
The smaller value is linked to the result list (cur.next), and the corresponding pointer (list1 or list2) is moved to the next node.
The cur pointer is also moved to the newly added node in the result list.
The loop continues until one of the input lists is exhausted.
After the loop, if there are remaining nodes in either list1 or list2, they are appended to the result list.

Time complexity: O(n) where n is the total number of nodes in the merged list.
