import java.util.Scanner;

public class MaximumAmountGold {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			int capacity = sc.nextInt();
			int numBars = sc.nextInt();
			
			int[] barWeight = new int[numBars];
			
			for(int idx = 0; idx < numBars; idx++) {
				barWeight[idx] = sc.nextInt();
			}
			
		sc.close();
		
		int[][] dpArray = new int[numBars + 1][capacity + 1];
		
		// Initialise first row and first column with zeros.
		for(int row = 0; row <= numBars; row++) {
			dpArray[row][0] = 0;
		}
		
		for(int column = 0; column <= capacity; column++) {
			dpArray[0][column] = 0;
		}
		
		// Check how to fill knapsack one item at a time.
		
		for(int bar = 1; bar <= numBars; bar++) {
			for(int cap = 1; cap <= capacity; cap++) {
				
				dpArray[bar][cap] = dpArray[bar-1][cap];
				
				// If bar fits knapsack with capacity "cap".
				if(barWeight[bar-1] <= cap) {
					int temp = dpArray[bar-1][cap-barWeight[bar-1]] + barWeight[bar-1]; // Fetch data of only using previous bar and capacity = cap - barWeight (bar we want to add or not). 
					
					if(dpArray[bar][cap] < temp) {
						dpArray[bar][cap] = temp; // If it maximises the knapsack value, add bar to it.
					}
				}
			}
		}
		System.out.println(dpArray[numBars][capacity]);
	}
}
