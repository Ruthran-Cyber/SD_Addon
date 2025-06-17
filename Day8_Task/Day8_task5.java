package sd_addon;

public class Day8_task5 {
	public class Task_5 {
		public void find(int num) {
			int arr[] = {23,52,67,52,52,34,52,36};
			int count=0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]==num) {
					count++;
				}
			}
			System.out.println(count);
		}
		public static void main(String[] args) {
			Task_5 ts = new Task_5();
			ts.find(52);
		}
	}
}
