package sd_addon;


	import java.util.Arrays;
	public class Day7_task1 {

		public void Bubblesort(int sample[]) {
			for (int i = 1; i < sample.length; i++) {
				for (int j = 0; j < sample.length-1; j++) {
					if (sample[j]>sample[j+1]) {
						int temp = sample[j];
						sample[j] = sample[j+1];
						sample[j+1] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(sample));
		}
		public static void main(String[] args) {
			Day7_task1 ts = new Day7_task1();
			int arr[] = {98,76,65,43,24,4,2,6};
			ts.Bubblesort(arr);
		}
	}

