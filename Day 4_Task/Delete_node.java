package sd_addon;
public class Delete_node {
    static class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }
    static class DoublyLinkedList {
        Node head;
        void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node last = head;
            while (last.next != null)
                last = last.next;
            last.next = newNode;
            newNode.prev = last;
        }
        void insertInMiddle(int data) {
            if (head == null) {
                head = new Node(data);
                return;
            }
            Node slow = head, fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node newNode = new Node(data);
            Node nextNode = slow.next;
            slow.next = newNode;
            newNode.prev = slow;
            newNode.next = nextNode;
            if (nextNode != null) {
                nextNode.prev = newNode;
            }
        }
        void deleteMiddle() {
            if (head == null) return;

            if (head.next == null) {
                head = null;
                return;
            }
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node prevNode = slow.prev;
            Node nextNode = slow.next;

            if (prevNode != null) {
                prevNode.next = nextNode;
            }
            if (nextNode != null) {
                nextNode.prev = prevNode;
            }

            if (slow == head) {
                head = nextNode;
            }
        }
        void printForward() {
            Node curr = head;
            System.out.print("Forward: ");
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
        void printBackward() {
            Node curr = head;
            if (curr == null) return;
            while (curr.next != null)
                curr = curr.next;
            System.out.print("Backward: ");
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.prev;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(5);
        dll.printForward();    
        dll.printBackward();   
        dll.deleteMiddle();
        dll.printForward();    
        dll.printBackward();   
    }
}

