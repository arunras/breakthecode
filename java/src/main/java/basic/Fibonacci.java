package basic;

public class Fibonacci {
	
	// Recursive
	public static int fib(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	
	public static void printFib(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.print(fib(i) + ",");
		}
	}
}
