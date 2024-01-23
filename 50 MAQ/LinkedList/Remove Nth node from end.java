class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;  // Handle the case when the list is empty
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast == null) {
                return head;  // n is greater than the length of the list
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }
}

Algo:
A dummy node is created and linked to the head of the original linked list. This dummy node helps in handling the case where the node to be removed is the head itself.
Two pointers, fast and slow, are initialized to point to the dummy node. The fast pointer is moved ahead by n+1 steps.
The fast pointer is moved until it reaches the end of the list, and simultaneously, the slow pointer is moved as well. This ensures that the distance between fast and slow is maintained at n+1 nodes.
When the fast pointer reaches the end, the slow pointer is at the node just before the one to be removed. The slow.next pointer is then updated to skip the n-th node.
The modified linked list (after removal) is returned, starting from the next node of the dummy node.

Time complexity: O(N), where N is the number of nodes in the linked list.
