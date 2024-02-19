package LInkedList;

import LInkedList.ListNode;

public class _328_Odd_Even_Linked_List {

    public static ListNode oddEvenList(ListNode head) {

        ListNode oddNode = head;
        ListNode evenNode = head.next;
        ListNode evenOrigin = head.next;

        ListNode temp1 = null;
        ListNode temp2 = null;

        while (oddNode!=null && oddNode.next != null && evenNode!=null && evenNode.next!=null){
            temp1 = oddNode.next.next;
            oddNode.next = temp1;
            oddNode = temp1;

            temp2 = evenNode.next.next;
            evenNode.next = temp2;
            evenNode = temp2;
        }

        oddNode.next = evenOrigin;
        //System.out.println(head);

        return head;
    }

    public static void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("List is Empty!");
        } else {
            ListNode temp = head;
            while (temp != null) {

                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        printLinkedList(n1);

        n1 = oddEvenList(n1);
        printLinkedList(n1);
    }
}
