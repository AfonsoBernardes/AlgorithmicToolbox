import java.util.Scanner;

public class CarFueling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt(); // Distance to travel
		int m = sc.nextInt(); // Miles on full tank
		int numStops = sc.nextInt(); // Number of stops
		
		int[] stops = new int[numStops + 2];
		stops[0] = 0; // Starting point
		stops[numStops+1] = d; // Make last stop the destination
		
		for(int idx = 1; idx <= numStops; idx++) {
			stops[idx] = sc.nextInt(); // Stop locations from initial point 0
		}
		
		
		sc.close();
		
		// Greedy algorithm: Always go to farthest station possible
		
		int position = 0;
		int positionIndex = 0;
		int refillCounter = 0;
		
		while(true) {
			
			// Can we go straight to the end?
			if((d - position) <= m) {
				position = d;
				break;
			}
			
			// Check if we can reach closest station
			if(stops[positionIndex+1] - position > m) {
				refillCounter = -1;
				break;
			}
			
			
			for(int idx = positionIndex+1; idx <= numStops+1 ; idx++) {
				
				// Check first unreachable station. Update position to the one before that.
				if((stops[idx] - position) > m) {
					position = stops[idx-1];
					positionIndex = idx-1;
					refillCounter++;
					break;
				}
			}
		}
		System.out.println(refillCounter);
	}

}
