package sd_addon;
public class Main_Program3 {
		    static class Node {
	        int data;
	        Node next;
	        Node(int d) { data = d; next = null; }
	    }
	    Node head = null;
	 	    void add(int data) {
	        Node newNode = new Node(data);
	        if (head == null) head = newNode;
	        else {
	            Node cur = head;
	            while (cur.next != null) cur = cur.next;
	            cur.next = newNode;
	        }
	    }
	   	    void reverse() {
	        Node prev = null;
	        Node current = head;
	        Node next = null;
	        while (current != null) {
	            next = current.next;  
	            current.next = prev;  
	            prev = current;      
	            current = next;       
	        }
	        head = prev; 
	    }
	   	    void display() {
	        Node cur = head;
	        while (cur != null) {
	            System.out.print(cur.data + " -> ");
	            cur = cur.next;
	        }
	        System.out.println("null");
	    }
    public static void main(String[] args) {
	    	Main_Program3 list = new Main_Program3();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        System.out.print("Original list: ");
	        list.display();
	        list.reverse();
	        System.out.print("Reversed list: ");
	        list.display();
	    }
	}


