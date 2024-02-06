public class LT_LinkedList {

    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is Empty!");
        } else {
            Node temp = head;
            while (temp != null) {

                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            Node temp = headNode;
            while (temp != null) {
                if (temp.next == null) {
                    temp.next = newNode;
                    newNode.next = null;
                    return headNode;
                }
                temp = temp.next;
            }
        }
        return newNode;
    }

    public static Node addToIndex(Node headNode, int value, int position) {
        Node newNode = new Node(value);
        if (headNode == null || position == 0) {
            return addToHead(headNode, value);
        } else {
            int p = 0;
            Node temp = headNode;
            while (temp != null) {
                if (p == position - 1) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
                p++;
            }
        }
        return headNode;
    }

    public static Node delNodeHead(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    public static Node delNodeTail(Node headNode) {
        if (headNode != null) {
            Node temp = headNode;
            Node previous = null;

            while (temp.next != null) {
                previous = temp;
                temp = temp.next;
            }

            if (previous != null) {
                previous.next = null;  // cập nhật node cuối
            } else {
                // Nếu chỉ có một nút trong list
                headNode = null;
            }
        }
        return headNode;
    }

    public static Node delNodeIndex(Node headNode, int index) {
        if (headNode == null || index < 0) {
            return null;
        }
        if (index == 0) {
            return headNode.next;
        }
        int p = 0;
        Node current = headNode;
        Node previous = null;
        while (current!=null && p < index) {
            previous = current;
            current = current.next;
            p++;
        }
        if (current != null){
            previous.next = current.next;
            current.next = null;
        }
        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);

        n1 = addToHead(n1, 0);
        printLinkedList(n1);

        n1 = addToTail(n1, 22);
        printLinkedList(n1);

        n1 = addToIndex(n1, 33, 3);
        printLinkedList(n1);

        n1 = addToIndex(n1, 44, 0);
        printLinkedList(n1);

        n1 = delNodeHead(n1);
        printLinkedList(n1);

        n1 = delNodeTail(n1);
        printLinkedList(n1);

        n1 = delNodeIndex(n1, 2);
        printLinkedList(n1);

        n1 = delNodeIndex(n1, 0);
        printLinkedList(n1);

        n1 = delNodeIndex(n1, 1);
        printLinkedList(n1);
    }
}
