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
