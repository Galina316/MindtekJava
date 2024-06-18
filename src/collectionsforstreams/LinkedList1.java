package collectionsforstreams;

public class LinkedList1 {
    Node head;

    public LinkedList1() {
        this.head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node last = head;
        while(last.next!=null){
            last=last.next;
        }

        last.next=newNode;
    }
}
