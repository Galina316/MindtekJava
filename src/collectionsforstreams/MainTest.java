package collectionsforstreams;

public class MainTest {
    public static void main(String[] args) {
        LinkedList1 linkedList = new LinkedList1();
        Node fNode= new Node(5);
        Node sNode = new Node(7);
        Node tNode = new Node(10);
        Node eNode = new Node(11);
        fNode.next=sNode;
        sNode.next=tNode;
        fNode.next=eNode;
        eNode.next=sNode;
        System.out.println(fNode);
        addvalueToEachNode(5,fNode);
        pintList(fNode);

        //

    }

    private static void addvalueToEachNode(int i, Node node) {
        Node current = node;
        while(current!=null){
            current.data=current.data+i;
            current=current.next;
        }
    }

    private static void pintList(Node node) {
        Node current = node;
        while (current.next !=null){
            System.out.print(current.data+" -> ");
            current= current.next;
        }
    }
}
