import java.util.Scanner;

public class PrimitiveCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			int inputNumber = sc.nextInt();
		sc.close();

		int[] operations = {1, 2, 3}; // Add one OR multiply by 2 or 3
		
		// I chose to create array with one more entrance so that the array index would match the respective number.
		int[] dpArray = new int[inputNumber+1]; // Dynamic Programming Array -> Stores number of operations needed.
		
		dpArray[0] = 0; // Zero operations to get to 0.
		dpArray[1] = 0; // Zero operations to get to 1. We always start from one.
		
		int optsCounter = 0;
		for(int number = 2; number <= inputNumber; number++) {
			
			dpArray[number] = (int) Double.POSITIVE_INFINITY;
					
			for(int opt : operations) {
				
				if(opt == 1) {
					optsCounter = dpArray[number-opt] + 1;
				}
				
				else {
					
					if ((number % opt) == 0) {
						// If number is divisible by "opt", we only need to perform one more operation.
						optsCounter = dpArray[number/opt] + 1;
					}
					
					else {
						// If number is not divisible by "opt", sum one to previous number of opts, since previous number will be divisible by 2 or 3.
						optsCounter = dpArray[number-1] + 1;
					}
				}
				
				// If less operations are needed, update array.
				if(optsCounter < dpArray[number]) {
					dpArray[number] = optsCounter;
				}
			}
		}
		
		// Backtracking performed operations.
		
		int number = inputNumber;
		String numberSequence = "" + inputNumber;
		
		while(number != 1) {
			
			// Check if it is divisible and if number of operations needed checks out.
			if ((number % operations[2]) == 0 && (dpArray[number] == dpArray[number/operations[2]] + 1)) {
				number = number / operations[2];
				numberSequence = number + " " + numberSequence;
			}
			
			else if((number % operations[1]) == 0 && (dpArray[number] == dpArray[number/operations[1]] + 1)){
				number = number / operations[1];
				numberSequence = number + " " + numberSequence;
			}
			
			else {
				number = number - operations[0];
				numberSequence = number + " " + numberSequence;
			}
		}
		
		System.out.println(dpArray[inputNumber]);
		System.out.println(numberSequence);
	}
}
