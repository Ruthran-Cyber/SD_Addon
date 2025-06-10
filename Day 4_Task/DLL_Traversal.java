package sd_addon;
public class DLL_Traversal {
    class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }
    class DoublyLinkedList {
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
        DLL_Traversal outer = new DLL_Traversal();
        DoublyLinkedList dll = outer.new DoublyLinkedList();
        dll.append(10);
        dll.append(20);
        dll.append(30);

        dll.printForward();
        dll.printBackward();
    }
}
