package sd_addon;
import java.util.Scanner;
public class Menu_Post {
	    static class Node {
	        int data; Node next;
	        Node(int d) { data = d; next = null; }
	    }
	    Node head = null;
	    void insertEnd(int d) {
	        Node n = new Node(d);
	        if (head == null) head = n;
	        else {
	            Node cur = head;
	            while(cur.next != null) cur = cur.next;
	            cur.next = n;
	        }
	    }
	    void deletePos(int pos) {
	        if (head == null) return;
	        if (pos == 0) { head = head.next; return; }
	        Node cur = head;
	        for (int i=0; cur != null && i < pos-1; i++) cur = cur.next;
	        if (cur == null || cur.next == null) return;
	        cur.next = cur.next.next;
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
	        Scanner sc = new Scanner(System.in);
	        Menu_Post list = new Menu_Post();
	        while(true) {
	            System.out.println("\n1: Insert End  2: Delete Pos  3: Display  4: Exit");
	            System.out.print("Choice: ");
	            int c = sc.nextInt();
	            if (c == 1) {
	                System.out.print("Enter value: ");
	                int v = sc.nextInt();
	                list.insertEnd(v);
	            } else if (c == 2) {
	                System.out.print("Enter position: ");
	                int p = sc.nextInt();
	                list.deletePos(p);
	            } else if (c == 3) {
	                list.display();
	            } else break;
	        }
	        sc.close();
	    }
	}


