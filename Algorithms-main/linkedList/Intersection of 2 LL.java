public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLen(headA);
        int lenB = getLen(headB);

        while(lenA>lenB){
            headA=headA.next;
            lenA--;
        }
        while(lenA<lenB){
            headB=headB.next;
            lenB--;
        }

        while(headA!=headB){
             headA=headA.next;
             headB=headB.next;
        }
        return headA;
    }

    public int getLen(ListNode head){
        int l =0;
        while(head!=null){
            l++;
            head=head.next;
        }
        return l;
    }
}

Algo:
take out len of both linked list
match the len of both linked list and move the pointer to next and make sure length of both ll are same.
check till both the values are same and if not return the value.


Time complexity: 
O(m+n)
    
