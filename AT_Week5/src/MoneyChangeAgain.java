import java.util.Scanner;

public class MoneyChangeAgain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			int money = sc.nextInt();
		sc.close();
		
		final int[] coins = {1, 3, 4};
		
		int[] moneyArray = new int[money + 1];
		moneyArray[0] = 0; //How many coins are needed to change zero? 0
		
		for(int m = 1; m <= money; m++) {
			
			moneyArray[m] = (int)Double.POSITIVE_INFINITY; // Initialise array with big value.
			
			for(int coin : coins) { // For each coin denomination available.
				
				if((m-coin) >= 0) { // If coin value does not exceed m, then...
					
					int coinCounter = moneyArray[m-coin] + 1; // Check how many coins needed to change "m-coin" amount. Add one to it.
					
					if(coinCounter < moneyArray[m]) { // If less coins are needed compared to other combinations, use that.
						moneyArray[m] = coinCounter;
					}
				}
			}
		}
		System.out.println(moneyArray[money]);
	}

}
