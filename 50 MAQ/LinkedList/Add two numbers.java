class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode res = result;
        int c =0;
        while(l1!=null || l2!=null){
            int x = (l1!=null) ? l1.val: 0;
            int y = (l2!=null) ? l2.val: 0;
            int s = x + y + c;
            c = s/10;
            res.next = new ListNode(s%10);
            res = res.next;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }

        if(c>0){
            res.next = new ListNode(c);
        }

        return result.next;

    }
}

ALGO:

nitialize a dummy node result to keep track of the result linked list.
Initialize a pointer res to result.
Initialize a variable c to store the carry.
Traverse both input linked lists simultaneously until both are null.
Inside the loop, calculate the sum of current nodes of l1 and l2 along with the carry (c).
Update the carry (c) and create a new node with the sum's unit digit and attach it to the result linked list.
Move res to the next node.
Move l1 and l2 to their respective next nodes.
If there's still a carry after the loop, add a new node with the carry.
Return the next node of the result (the first node is initialized with 0, so we skip it).


TC: O(max(m, n))
