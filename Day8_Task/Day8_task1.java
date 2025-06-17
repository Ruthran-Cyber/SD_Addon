package sd_addon;


	import java.util.Scanner;

	
		public class Day8_task1 {
		public void find(int num) {
			int arr[] = {23,52,67,56,32,34,71,36};
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]==num) {
					System.out.println("Value "+arr[i]+" Found at the position "+(i+1));
				}
			}
		}
		public static void main(String[] args) {
			Day8_task1 ts = new Day8_task1();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Value");
			int a = sc.nextInt();
			ts.find(a);
			sc.close();
		}
	}

