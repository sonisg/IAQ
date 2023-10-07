package com.company.linkedList;

public class ReverseLL {

    static Node head;

    static class Node{
        int data;
        Node next;
        Node(int da){
            data = da;
            next = null;
        }
    }


    Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }


    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    public static void main(String[] args)
    {
        ReverseLL list = new ReverseLL();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(79);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

/** Time Complexity = O(N), As we are traversing the list only once.**/
}
