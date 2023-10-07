package com.company.linkedList;

public class DetectLoop {
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void detectLoop()
    {

        Node slow = head, fast = head;
        int f =0;
        while(slow != null && fast!=null && fast.next!= null){
            slow= slow.next;
            fast = fast.next.next;
            if(slow== fast){
                f =1;
                break;
            }
        }
        if(f==1)
            System.out.println("Loop Detected");
        else
            System.out.println("Loop not detected");
    }


    public static void main(String args[])
    {
        DetectLoop llist = new DetectLoop();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        llist.push(34);
        llist.push(99);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        llist.detectLoop();
    }
}
/** Time complexity: O(n).
 Only one traversal of the loop is needed.
 Auxiliary Space:O(1).
 There is no space required.
 **/

/** Floyd’s Cycle-Finding Algorithm: Move slow pointer by 1 and fast pointer by 2. When it meets the cycle is detected **/