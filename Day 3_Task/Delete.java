package sd_addon;
	public class Delete {
	    static class Node {
	        int data;
	        Node next;
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	    Node head = null;
	    	    public void insertAtPosition(int data, int position) {
	        Node newNode = new Node(data);
	        if (position == 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        int count = 0;
	        while (current != null && count < position - 1) {
	            current = current.next;
	            count++;
	        }
	        if (current == null) {
	            System.out.println("Position out of bounds.");
	            return;
	        }
	        newNode.next = current.next;
	        current.next = newNode;
	    }
		    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty, nothing to delete.");
	            return;
	        }
	  	        if (position == 0) {
	            head = head.next;
	            return;
	        }
	        Node current = head;
	        int count = 0;
	       	        while (current.next != null && count < position - 1) {
	            current = current.next;
	            count++;
	        }
	       	        if (current.next == null) {
	            System.out.println("Position out of bounds.");
	            return;
	        }
               current.next = current.next.next;
	    }
	  public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
   public static void main(String[] args) {
	        Delete list = new Delete();
	        list.insertAtPosition(10, 0); 
	        list.insertAtPosition(20, 1);
	        list.insertAtPosition(30, 2); 
	        list.insertAtPosition(15, 1); 
	        list.insertAtPosition(5, 0);  
	        System.out.print("Original list: ");
	        list.display();
	        list.deleteAtPosition(0);  
	        System.out.print("After deleting position 0: ");
	        list.display();
	        list.deleteAtPosition(2); 
	        System.out.print("After deleting position 2: ");
	        list.display();
	        list.deleteAtPosition(5);  
	    }
	}


