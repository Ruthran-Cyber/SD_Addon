package sd_addon;
import java.util.Scanner;
public class Sum_of_digits {
		    public static int sumOfDigits(int n) {
	        return (n == 0) ? 0 : (n % 10 + sumOfDigits(n / 10));
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        System.out.println("Sum of digits: " + sumOfDigits(num));
	    }
	}


