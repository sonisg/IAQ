package com.company.linkedList;

import java.util.LinkedList;

public class MiddleElementOfLL {
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

    public void printMiddle(){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Middle element : " + slow.data);
    }




    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }


    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String [] args)
    {
        MiddleElementOfLL llist = new MiddleElementOfLL();
        for (int i=6; i>0; --i)
        {
            llist.push(i);
            llist.printList();
            llist.printMiddle();
        }
    }

    /** Time Complexity = O(N), As we are traversing the list only once.
     *  Auxillary Space = O(1), As constant extra space is used.
     *  The algo goes like move one pointer with two steps and other with one step.
     *  When faster one reaches the end, the slow one will be at the middle.
     *  So that's the middle element.
     **/
}
