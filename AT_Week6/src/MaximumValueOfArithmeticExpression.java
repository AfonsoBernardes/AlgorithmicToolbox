import java.util.ArrayList;
import java.util.Scanner;

public class MaximumValueOfArithmeticExpression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			String expression = sc.next();
		sc.close();
		
		SplitResult sr = splitExpression(expression);
		
		/*
		 * System.out.println(sr.digits);
		 * System.out.println(sr.operations);
		 */
		
		int size = sr.digits.size();
		
		long[][] m = new long[size][size];
		long[][] M = new long[size][size];
		
		for(int idx = 0; idx < size; idx++) {				
			// If row == column, subexpression evaluates to correspondent digit.
			m[idx][idx] = Integer.parseInt(sr.digits.get(idx));
			M[idx][idx] = Integer.parseInt(sr.digits.get(idx));

		}
		
		for(int s = 0; s < size; s++) {
			for(int i = 0; i < size-s; i++) {
				
				int j = i+s;
				
				if(i != j) {
					long[] min_max = MinAndMax(i, j, m, M, sr);
					
					m[i][j] = min_max[0];
					M[i][j] = min_max[1];
				}
			}
		}
		
		System.out.println(M[0][size-1]);

	}
	
	public static SplitResult splitExpression(String expression) {
		
		String cumulativeDigits = "";
		SplitResult sr = new SplitResult(); 
		
		for(int idx = 0; idx < expression.length(); idx++) {
			
			if(expression.charAt(idx) == '+' || expression.charAt(idx) == '-' || expression.charAt(idx) == '*') {
				sr.operations.add("" + expression.charAt(idx));
				sr.digits.add(cumulativeDigits);
				cumulativeDigits = ""; // Reset cumulativeDigits
			}
			
			else {
				// If there is more than one digit in a number, accumulate until ready to add.
				cumulativeDigits += expression.charAt(idx);
			}
		}
		// Add last number to array, since it is not added because there is no operation in the end.
		sr.digits.add(cumulativeDigits);
		return sr;
	}
	
	public static long[] MinAndMax(int i, int j, long[][] m, long[][] M, SplitResult sr) {
		
		long min = (int) Double.POSITIVE_INFINITY;
		long max = (int) Double.NEGATIVE_INFINITY;
		
		long[] min_max = {0,0};
		
		long a = 0, b = 0, c = 0, d = 0;
		
		for(int k = i; k < j; k++) {
			
			if(sr.operations.get(k).equals("+")) {
				a = M[i][k] + M[k+1][j];
				b = M[i][k] + m[k+1][j];
				c = m[i][k] + M[k+1][j];
				d = m[i][k] + m[k+1][j];
			}
			
			else if(sr.operations.get(k).equals("-")) {
				a = M[i][k] - M[k+1][j];
				b = M[i][k] - m[k+1][j];
				c = m[i][k] - M[k+1][j];
				d = m[i][k] - m[k+1][j];
			}
			
			else if(sr.operations.get(k).equals("*")) {
				a = M[i][k] * M[k+1][j];
				b = M[i][k] * m[k+1][j];
				c = m[i][k] * M[k+1][j];
				d = m[i][k] * m[k+1][j];
			}
			
			min = Math.min(min, Math.min(a, Math.min(b, Math.min(c, d))));
			max = Math.max(max, Math.max(a, Math.max(b, Math.max(c, d))));
		}
		min_max[0] = min;
		min_max[1] = max;
		return min_max;
	}
	
}


class SplitResult{
	ArrayList<String> digits = new ArrayList<String>();
	ArrayList<String> operations = new ArrayList<String>();
}
