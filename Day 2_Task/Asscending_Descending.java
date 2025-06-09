package sd_addon;
import java.util.Scanner;
import java.util.Arrays;
public class Asscending_Descending {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        Arrays.sort(arr);
	        int[] sortedArr = new int[n];
	        for (int i = 0; i < n; i++) {
	            sortedArr[i] = arr[n - 1 - i];
	        }

	        System.out.println("Sorted array in descending order:");
	        for (int num : sortedArr) {
	            System.out.print(num + " ");
	        }
	    }
	}


