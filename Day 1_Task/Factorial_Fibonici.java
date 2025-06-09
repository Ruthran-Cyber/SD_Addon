package sd_addon;

public class Factorial_Fibonici {
	
	    public static void main(String[] args) {
	        int num = 5;
	        System.out.println("Factorial of " + num + ": " + factorial(num));
	        System.out.println(num + "th Fibonacci number: " + fibonacci(num));
	    }

	    public static int factorial(int n) {
	        return (n <= 1) ? 1 : n * factorial(n - 1);
	    }

	    public static int fibonacci(int n) {
	        return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}


