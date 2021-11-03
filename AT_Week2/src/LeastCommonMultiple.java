import java.util.Scanner;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		
		sc.close();
		
		// lcm(a,b) = a*b / gcd(a,b)
		
		long gcd = gcd(a, b);
		long lcm = (a*b)/gcd;
		
		System.out.println(lcm);
		
	}
	
	public static long gcd(long n1, long n2) {
		
		long R = n1 % n2;

		while(R > 0) {
			n1 = n2;
			n2 = R;
			R = n1 % n2;
		}
		
		return n2;
	}

}
