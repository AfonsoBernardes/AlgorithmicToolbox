import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		sc.close();
		
		// Euclidean Algorithm.
		int R = a % b;

		while(R > 0) {
			a = b;
			b = R;
			R = a % b;
		}
		
		System.out.println(b);
	}
}
