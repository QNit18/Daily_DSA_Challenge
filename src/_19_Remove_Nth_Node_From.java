public class _19_Remove_Nth_Node_From {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode previous = null;
        int count = 1; // start at : node 1
        while (temp != null) {
            if (count == n + 1) {
                previous = head;
            }

            // If the last node
            if (temp.next == null) {
                if (previous == null) {
                    if (count == n) {
                        return head.next;
                    }
                    return head;
                } else {
                    if (previous.next != null) {
                        previous.next = previous.next.next;
                    }
                    return head;
                }
            }

            temp = temp.next;
            previous = previous == null ? null : previous.next;
            count++;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;


    }
}
