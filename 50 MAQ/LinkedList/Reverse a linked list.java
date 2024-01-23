class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr=next;

        }
        head= prev;
        return head;
        
    }
}


Algo:
Three pointers prev, curr, and next are initialized. prev is initially set to null, and curr is set to the head of the linked list.
Inside the while loop, the next pointer is used to temporarily store the next node in the original list.
The curr.next pointer is then updated to point to the prev node, effectively reversing the link direction for the current node.
The prev pointer is moved to the current node (curr), the curr pointer is moved to the next node (next), and the loop continues until curr becomes null.
After the loop, the head pointer is updated to point to the new head of the reversed list, which is the last node in the original list.
The reversed list is returned.

time complexity of this algorithm is O(n), where n is the number of nodes in the linked list.
