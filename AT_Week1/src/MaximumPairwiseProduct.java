import java.util.Arrays;
import java.util.Scanner;

public class MaximumPairwiseProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] inputArray = new long[n];
		
		for(int idx = 0; idx < n; idx++) {
			inputArray[idx] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(inputArray);
		
		long maxPairwiseProduct = inputArray[n-1]*inputArray[n-2];
		
		System.out.println(maxPairwiseProduct);
	}
}
