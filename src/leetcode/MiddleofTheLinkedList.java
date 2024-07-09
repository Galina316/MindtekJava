package leetcode;

import java.util.List;

public class MiddleofTheLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public static ListNode middleNode1(ListNode head) {
        int length = 0;
        ListNode curr = head;
        while(curr!=null){
            curr=curr.next;
            length++;
    }
        int mid = 0;
        curr=head;
        while(curr!=null){
            curr=curr.next;
            mid++;
            if(mid==length/2)return curr;
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode n1= new ListNode(1);
        ListNode n2= new ListNode(2);
        ListNode n3= new ListNode(3);
        ListNode n4= new ListNode(4);
        ListNode n5= new ListNode(5);
        n1.next = n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        int length = 0;
        ListNode curr = n1;
        while(curr!=null){
            curr=curr.next;
            length++;
        }
        curr=n1;
        ListNode prev = null;
        int mid = 2;
        int i=0;
        while(i<mid){
            curr=curr.next;
            i++;
            prev = curr;
        }
        System.out.println(prev.val);
        System.out.println(curr.val);
        prev.next=curr.next;
        curr.next=null;
    }



    public static ListNode middleNodeDelete(ListNode head) {
        if(head.next==null)return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next=slow.next;

        return head;

    }
}
