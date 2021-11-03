import java.util.Arrays;
import java.util.Scanner;


public class MajorityElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numInputs = sc.nextInt();
		int[] inputArray = new int[numInputs];
		
		for(int idx = 0; idx < numInputs; idx++) {
			inputArray[idx] = sc.nextInt();
		}
		
		Arrays.sort(inputArray); // Sort array so we can apply Binary Search
		
		sc.close();
		
		int index = 0;
		while(true) {
			
			// Find first and last instance of key
			int firstInstance = FirstInstanceOf(inputArray, inputArray[index], index);
			int lastInstance = LastInstanceOf(inputArray, inputArray[index], firstInstance);
			
			index = lastInstance + 1; // Update where to start looking next, if needed.
			
			// Check for majority
			if(((lastInstance - firstInstance) + 1) > (double)numInputs/2) {
				System.out.println(1);
				return;
			}
			
			if(index >= numInputs) {
				System.out.println(0);
				return;
			}
		}
	}
	

		public static int FirstInstanceOf(int[] array, int key, int start) {
			
			int firstPos = 0;
			for(int idx = start; idx < array.length; idx++) {
				if(array[idx] == key) {
					firstPos = idx;
					break;
				}
			}
			return firstPos; // If first instance of key is the position we found in BS
		}
		
		
		public static int LastInstanceOf(int[] array, int key, int firstPos) {
			
			int lastPos = firstPos;
			for(int idx = firstPos; idx < array.length; idx++) {
				
				if(array[idx] != key) {
					lastPos = idx-1;
					break;
				}
				
				// If last element is still equal to key, the above if-block will not be executed, but we still need a LastInstance
				else if(idx == array.length-1 && array[idx] == key) {
					lastPos = idx;
					break;
				}
			}
			return lastPos; // If only instance of key is the position we found in BS
		}

}
