import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numInputs = sc.nextInt();
		int[] inputArray = new int[numInputs];
		
		for(int idx = 0; idx < numInputs; idx++) {
			inputArray[idx] = sc.nextInt();
		}
		
		
		int numKeys = sc.nextInt();
		int[] keysArray = new int[numKeys];
		
		for(int idx = 0; idx < numKeys; idx++) {
			keysArray[idx] = sc.nextInt();
		}
		
		sc.close();
		
		int[] outputArray = new int[numKeys];
		
		for(int idx = 0; idx < numKeys; idx++) {
			outputArray[idx] = BS(inputArray, 0, numInputs-1, keysArray[idx]); // Used for duplicates
			System.out.print(outputArray[idx] + " ");
		}
	}
	
	public static int BS(int[] array, int low, int high, int key) {
		
		// If high < low, there is no such element in array.
		if(high < low) {
			return -1;
		}
		
		int mid = (int) Math.floor(low + (double)(high - low)/2);
		
		// We found the key
		if(key == array[mid]) {
			mid = FirstInstanceOf(array, key, mid);
			return mid;
		}
		
		else if(key > array[mid]) {
			return BS(array, mid+1, high, key);
		}
		
		//else if (key < array[mid])
		else {
			return BS(array, low, mid-1, key);
		}
	}
	
	public static int FirstInstanceOf(int[] array, int key, int pos) {
		
		for(int idx = 0; idx < pos; idx++) {
			if(array[idx] == key) {
				return idx;
			}
		}
		return pos; // If first instance of key is the position we found in BS
	}

}
