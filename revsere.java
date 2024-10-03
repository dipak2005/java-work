
public class revsere {

    // Node class
    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class
    class LinkedList {

        Node head; // Head of the list

        // Constructor
        LinkedList() {
            head = null;
        }

        // Method to append a new node to the end of the list
        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Method to reverse every k nodes in the linked list
        public void reverse(int k) {
            head = reverseInGroups(head, k);
        }

        // Helper method to reverse in groups of k
        private Node reverseInGroups(Node head, int k) {
            Node prev = null;
            Node curr = head;
            Node next = null;
            int count = 0;

            // Check if we have at least k nodes to reverse
            Node temp = head;
            while (temp != null && count < k) {
                temp = temp.next;
                count++;
            }

            if (count < k) {
                return head; // Not enough nodes to reverse, return original head
            }

            count = 0;
            while (curr != null && count < k) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }

            // Now head points to the last node in the reversed segment
            if (next != null) {
                head.next = reverseInGroups(next, k);
            }

            return prev;
        }
    }

}
