package sd_addon;
import java.util.Scanner;
public class Recursive {
	    static int[] arr = {5, 2, 8, 1, 9};
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        displayMenu();
	    }

	    static void displayMenu() {
	        System.out.println("\n1. Insert\n2. Update\n3. Delete\n4. Display\n5. Exit");
	        System.out.print("Choose an option: ");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1: insert(); break;
	            case 2: update(); break;
	            case 3: delete(); break;
	            case 4: display(); break;
	            case 5: System.out.println("Exiting..."); return;
	            default: System.out.println("Invalid choice.");
	        }
	        displayMenu(); // Recursive call
	    }

	    static void insert() {
	        System.out.print("Enter value to insert: ");
	        int value = sc.nextInt();
	        System.out.print("Enter position to insert at: ");
	        int pos = sc.nextInt();
	        if (pos < 0 || pos > arr.length) {
	            System.out.println("Invalid position.");
	            return;
	        }
	        int[] newArr = new int[arr.length + 1];
	        System.arraycopy(arr, 0, newArr, 0, pos);
	        newArr[pos] = value;
	        System.arraycopy(arr, pos, newArr, pos + 1, arr.length - pos);
	        arr = newArr;
	        System.out.println("Inserted " + value + " at position " + pos);
	    }

	    static void update() {
	        System.out.print("Enter position to update: ");
	        int pos = sc.nextInt();
	        if (pos < 0 || pos >= arr.length) {
	            System.out.println("Invalid position.");
	            return;
	        }
	        System.out.print("Enter new value: ");
	        int newValue = sc.nextInt();
	        arr[pos] = newValue;
	        System.out.println("Updated position " + pos + " to " + newValue);
	    }

	    static void delete() {
	        System.out.print("Enter position to delete: ");
	        int pos = sc.nextInt();
	        if (pos < 0 || pos >= arr.length) {
	            System.out.println("Invalid position.");
	            return;
	        }
	        int[] newArr = new int[arr.length - 1];
	        System.arraycopy(arr, 0, newArr, 0, pos);
	        System.arraycopy(arr, pos + 1, newArr, pos, arr.length - pos - 1);
	        arr = newArr;
	        System.out.println("Deleted element at position " + pos);
	    }

	    static void display() {
	        System.out.print("Array elements: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}


