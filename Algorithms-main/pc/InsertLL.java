package pc;

public class InsertLL {

    Node head;

    public class Node{

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int x){
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
        } else{
            Node tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertLL list = new InsertLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.display();
    }
}
