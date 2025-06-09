package sd_addon;
import java.util.*;
public class Array_operation {
	   public static void main(String[] args) {
	        int[] arr = {5, 2, 8, 1, 9};
	        arr = insert(arr, 10, 2);
	        arr = update(arr, 3, 20);
	        arr = delete(arr, 1);
	        System.out.println(Arrays.toString(arr));
	    }

	    public static int[] insert(int[] arr, int value, int pos) {
	        int[] newArr = new int[arr.length + 1];
	        System.arraycopy(arr, 0, newArr, 0, pos);
	        newArr[pos] = value;
	        System.arraycopy(arr, pos, newArr, pos + 1, arr.length - pos);
	        return newArr;
	    }

	    public static int[] update(int[] arr, int pos, int newValue) {
	        arr[pos] = newValue;
	        return arr;
	    }

	    public static int[] delete(int[] arr, int pos) {
	        int[] newArr = new int[arr.length - 1];
	        System.arraycopy(arr, 0, newArr, 0, pos);
	        System.arraycopy(arr, pos + 1, newArr, pos, arr.length - pos - 1);
	        return newArr;
	    }
	}


