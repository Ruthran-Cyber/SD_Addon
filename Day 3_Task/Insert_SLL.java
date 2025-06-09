package sd_addon;
class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;

	  
 public void insertAtPosition(int data, int position) {
	        Node newNode = new Node(data);

	        if (position == 0) {
	            newNode.next = head;
	            head = newNode;
	        } else {
	            Node current = head;
	            int count = 0;

	            while (current != null && count < position - 1) {
	                current = current.next;
	                count++;
	            }

	            if (current == null) {
	                System.out.println("Invalid position");
	                return;
	            }
	            newNode.next = current.next;
	            current.next = newNode;
	        }
	    }

	    
	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.insertAtPosition(1, 0);
	        list.insertAtPosition(2, 1);
	        list.insertAtPosition(3, 2);
	        list.insertAtPosition(4, 3);

	        System.out.println("Initial list:");
	        list.printList();

	        list.insertAtPosition(5, 2);
	        System.out.println("List after inserting 5 at position 2:");
	        list.printList();

	        list.insertAtPosition(6, 0);
	        System.out.println("List after inserting 6 at position 0:");
	        list.printList();
	    }
	}

