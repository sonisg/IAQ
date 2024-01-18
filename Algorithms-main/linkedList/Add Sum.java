class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode r = new ListNode(0);
        ListNode res = r;
        int carry =0;
        while(l1!=null || l2!=null){
            int x = (l1!=null) ? l1.val:0;
            int y = (l2!=null) ? l2.val:0;

            int sum = x + y+ carry;
            carry = sum / 10;
            res.next = new ListNode(sum % 10);
            res= res.next;

           if(l1!=null) l1=l1.next;
           if(l2!=null) l2=l2.next;
        }

        if(carry > 0){
            res.next = new ListNode(carry);
        }
        return r.next;    
    }
}

Algo:
1. Take a res linkedlist list and carry as 0.
2. iterate till both ll are null, keep val of ll1 in x and ll2 in y.
3. perform sum of both and add carry.
4. carry = sum/10
5. add sum%10 to res and move both the pointers.
6. check for carry and add to res at last.

Time complexity:
    O(max(N, M)), where N and M are the lengths of the input linked lists. 
    This is because the algorithm creates a new linked list to store the result, and the length of this result linked list is at most one more than the length of the longer input linked list.
