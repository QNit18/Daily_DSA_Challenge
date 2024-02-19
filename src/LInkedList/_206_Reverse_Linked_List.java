package LInkedList;

public class _206_Reverse_Linked_List {
    public static ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode nextNode ;

        while (currNode!= null && currNode.next != null){
            nextNode = currNode.next;
            currNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
