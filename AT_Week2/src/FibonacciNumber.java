import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		sc.close();
		
		// Initialise array
		int[] fibonacciArray = new int[n+1];		
		
		for(int idx = 0; idx <= n; idx++) {
			
			if(idx == 0 || idx == 1) {
				fibonacciArray[idx] = idx; // Initial conditions
			}
			
			else {
				fibonacciArray[idx] = fibonacciArray[idx-1] + fibonacciArray[idx - 2];
			}
		}
		
		System.out.println(fibonacciArray[n]);

	}
}
