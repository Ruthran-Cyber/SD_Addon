package sd_addon;
import java.util.Arrays;
public class MaxMinArray {
   public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};

        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}