import java.util.Scanner;

public class MoneyChange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		sc.close();

		// Coin denominations.
		final int coin1 = 1;
		final int coin2 = 5;
		final int coin3 = 10;
		
		int coinCounter = 0;
		
		// Always use biggest coin possible.
		while(m != 0) {
			if(m-coin3 >= 0) {
				m -= coin3;
				coinCounter++;
			}
			
			else if(m-coin2 >= 0){
				m -= coin2;
				coinCounter++;
			}
			
			else if(m-coin1 >= 0){
				m -= coin1;
				coinCounter++;
			}
		}
		System.out.println(coinCounter);
	}

}
