package sd_addon;


	import java.util.Arrays;
	import java.util.Scanner;
	public class Day8_task2 {
		int arr[] = {32,43,67,34,23,12,78};
		int low = 0;
		int high = arr.length-1;
		public void finder(int num) {
			Arrays.sort(arr);
			int mid = (low+high)/2;
			if(arr[mid]==num) {
				System.out.println(Arrays.toString(arr));
				System.out.println("Value "+arr[mid]+ " found at "+mid);
				return;
			}
			else if(low>high){
				System.out.println("Value is not stored in the array");
			}
			else {
			if(num<arr[mid]) {
				high--;
				finder(num);
			}
			else {
				low++;
				finder(num);
				}
			}
			}
		public static void main(String[] args) {
			Day8_task2 ts = new Day8_task2();
			Scanner ac = new Scanner(System.in);
			System.out.println("Enter the Number to find in the Array");
			int find = ac.nextInt();
			ts.finder(find);
			ac.close();
		}
	}

