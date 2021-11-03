import java.util.Scanner;

public class MaximumLootValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numOfItems = sc.nextInt();
		int capacity = sc.nextInt();
		
		int[] itemValue = new int[numOfItems];
		int[] itemWeight = new int[numOfItems];
		double[] itemValuePerWeight = new double[numOfItems];
		
		for(int idx = 0; idx < numOfItems; idx ++) {
			itemValue[idx] = sc.nextInt();
			itemWeight[idx] = sc.nextInt();
			
			itemValuePerWeight[idx] = (double)itemValue[idx] / (double)itemWeight[idx];
		}
		
		sc.close();
		
		double knapsackValue = 0.0;
		int indexOfMax = 0;
		double ratioCapacity_ItemWeight = 0; //How many times does the item fit in the knapsack?
		
		while(capacity > 0) {
			// Find index of maximum ratio value/weight
			indexOfMax = maximumValueWeighIndex(itemValuePerWeight);
			ratioCapacity_ItemWeight = (double)capacity / itemWeight[indexOfMax];
			
			if(ratioCapacity_ItemWeight > 1) {
				ratioCapacity_ItemWeight = 1.0;
			}
			
			// Update knapsack value by ValuePerWeight * amount Used
			knapsackValue += itemValuePerWeight[indexOfMax] * ratioCapacity_ItemWeight * itemWeight[indexOfMax];
			
			// Deduce as much of that item as possible, in this case, up to item's weight
			capacity -= ratioCapacity_ItemWeight * itemWeight[indexOfMax];
			
			// Since item won't be used again, update item's ValuePerWeight to zero so it is not selected again
			itemValuePerWeight[indexOfMax] = 0;
			
		}
		System.out.printf("%.4f%n", knapsackValue);
	}
	
	public static int maximumValueWeighIndex(double[] array) {
		
		int indexOfMax = 0;
		double max = array[indexOfMax];
		
		for(int idx = 0; idx < array.length; idx++) {
			
			if(array[idx] > max) {
				indexOfMax = idx;
				max = array[indexOfMax];
			}
		}
		return indexOfMax;
	}

}
