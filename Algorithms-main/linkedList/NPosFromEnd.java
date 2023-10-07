package com.company.linkedList;

public class NPosFromEnd {
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

    public static void main(String[] args)
    {
        NPosFromEnd llist = new NPosFromEnd();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);
        llist.push(95);
        llist.push(25);

        // Function call
        llist.printNthFromLast(3);
    }

    private void printNthFromLast(int i) {
        Node main = head;
        Node ref = head;
        int c = 0;
        if(head!= null){
            while (c < i) {
                ref = ref.next;
                c++;
            }

            if(ref == null){
                if (head != null) {
                    System.out.println("Node no. " + i + " from last is " + head.data);
                }
            }
            else {

                while (ref != null) {
                    main = main.next;
                    ref = ref.next;
                }
                System.out.println("Node no. " + i + " from last is " + main.data);
            }
        }
    }
}

/** Time Complexity: O(N) where N is the length of the linked list.
 Auxiliary Space: O(1) ***/


