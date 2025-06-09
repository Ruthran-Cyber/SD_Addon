package sd_addon;
import java.util.Scanner;
public class RemoveDuplicates {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	    	        int uniqueCount = removeDuplicates(arr);
	        	        System.out.println("Array after removing duplicates:");
	        for (int i = 0; i < uniqueCount; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	    public static int removeDuplicates(int[] arr) {
	        if (arr.length == 0) {
	            return 0;
	        }
	        int k = 0;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[k] != arr[i]) {
	                k++;
	                arr[k] = arr[i];
	            }
	        }
	        return k + 1; 
	    }
	}


