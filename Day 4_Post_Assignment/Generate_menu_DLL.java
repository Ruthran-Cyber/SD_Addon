package sd_addon;
import java.util.Scanner;
public class Generate_menu_DLL {
	        public static int addNumbers(int a, int b) {
	        return a + b;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice, num1, num2;
	        while (true) {
	            System.out.println("Menu:");
	            System.out.println("1. Add Numbers");
	            System.out.println("2. Exit");
	            System.out.print("Enter choice: ");
	            choice = scanner.nextInt();
	            if (choice == 1) {
	                System.out.print("Enter first number: ");
	                num1 = scanner.nextInt();
	                System.out.print("Enter second number: ");
	                num2 = scanner.nextInt();
	                System.out.println("Result: " + addNumbers(num1, num2));
	            } else if (choice == 2) {
	                System.out.println("Exiting...");
	                break;
	            } else {
	                System.out.println("Invalid choice. Try again.");
	            }
	        }
	        scanner.close();
	    }
	}
