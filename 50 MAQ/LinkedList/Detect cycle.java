public class Solution {
    public boolean hasCycle(ListNode head) {
       HashSet<ListNode> h = new HashSet<>();
       while(head!=null){
           if(h.contains(head)){
               return true;
           }
           h.add(head);
           head=head.next;
       }
       return false;
    }
}


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed)

Algo:
Create Hashset and add the value to it.
Check if already has the element it has a loop.
