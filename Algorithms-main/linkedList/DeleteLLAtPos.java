package com.company.linkedList;

public class DeleteLLAtPos {
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

    void delete (int pos){

        //if head is null then return as no ll is there
        if(head == null){
            return;
        }

        Node temp = head;
        //if position is 0 then head ka next becomes head
        if(pos == 0){
            head = temp.next;
            return;
        }

        //search for the node by iterating till the node to deleted previous node is found
        for( int i =0 ; temp != null && i < pos-1; i++){
            temp = temp.next;
        }

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        //Unlink the deleted node from list
        temp.next = next;
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
        DeleteLLAtPos llist = new DeleteLLAtPos();
        for (int i=0; i < 6; i++)
        {
            llist.push(i);
            llist.printList();
        }
        llist.delete(5);
        llist.printList();
    }
}

   /** Best Case : O(1) if given position is 1
        Average  & Worst Case : O(N)  if position given is size-1 then need to traverse till position not found.
        Space Complexity : O(1) no extra any space is required
    **/
