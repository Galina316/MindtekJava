package leetcode;

public class LinkedListCicle {
    public boolean hasCycle(ListNode head){
        if(head==null)return false;

        ListNode oneS = head;
        ListNode twoS=head;
        while(twoS.next!=null && twoS!=null){
            oneS = oneS.next;
            twoS=twoS.next.next;

            if(oneS==twoS) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // cicle not finish for Linked List



        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(7);
        n1.next = n2;
        n2.next= n3;
        n3.next = n1;
    }

}
