import java.util.Scanner;

public class EditDistance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			String str1 = sc.next();
			String str2 = sc.next();
		sc.close();
		
		// DP Matrix to keep track of editing distance cost.
		int[][] editingDistanceMatrix = new int[str1.length()+1][str2.length()+1];
		
		// Initialise row and columns [0]. -> "Initial conditions"
		for(int row = 0; row <= str1.length(); row ++) {
			editingDistanceMatrix[row][0] = row;
		}
		
		for(int column = 0; column <= str2.length(); column ++) {
			editingDistanceMatrix[0][column] = column;
		}
		
		int comparable1 = 0;
		int comparable2 = 0;
		int comparable3 = 0;
		// Start filling the matrix according to rules.
		for(int column = 1; column <= str2.length(); column++) {
			
			for(int row = 1; row <= str1.length(); row++) {
				
				comparable1 = editingDistanceMatrix[row][column-1] + 1;
				comparable2 = editingDistanceMatrix[row-1][column] + 1;
				
				if(str1.charAt(row-1) == str2.charAt(column-1)) {
					comparable3 = editingDistanceMatrix[row-1][column-1];
				}
				
				else if(str1.charAt(row-1) != str2.charAt(column-1)) {
					comparable3 = editingDistanceMatrix[row-1][column-1] + 1;
				}
				// Select minimum cost.
				editingDistanceMatrix[row][column] = Math.min(comparable1, Math.min(comparable2, comparable3));
			}
		}
		System.out.println(editingDistanceMatrix[str1.length()][str2.length()]);
	}
}
