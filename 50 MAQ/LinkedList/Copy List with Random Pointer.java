import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        // Map to store mapping between original and copied nodes
        Map<Node, Node> map = new HashMap<>();
        
        // Create a copy of each node and store mapping
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        
        // Reset current pointer to the head of the original list
        curr = head;
        
        // Set next and random pointers for copied nodes
        while (curr != null) {
            Node copyNode = map.get(curr);
            copyNode.next = map.get(curr.next);
            copyNode.random = map.get(curr.random);
            curr = curr.next;
        }
        
        // Return the head of the copied list
        return map.get(head);
    }
}


Algo:
Iterate through the original linked list and create a new copy of each node. For each copied node, set its next pointer to the next node in the copied list.
While creating the copy, store a mapping between the original node and its corresponding copied node.
Iterate through the original list again and for each copied node, set its random pointer based on the mapping stored in step 2.
