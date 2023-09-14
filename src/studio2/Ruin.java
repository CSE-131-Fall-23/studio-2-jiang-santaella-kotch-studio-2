package studio2;

public class Ruin {

	public static void main(String[] args) {
		int startAmount = 20;
		double winChance = 0.5;
		int winLimit = 40;
		int totalSimulations = 0;
		int counter = 0;
		
	while (totalSimulations < 5) {
		totalSimulations++;
		System.out.println("Simulation" + totalSimulations);
		
		while (startAmount < 30 && startAmount > 0) {
			winChance = Math.random();
			counter++;
			if (winChance <= 0.5) {
				startAmount++;
			}
		
			else
			{
				startAmount--;}
			}
		System.out.println("You played: " + counter + " times");
	}
		if (startAmount == winLimit) {
			System.out.println ("You win!");}
		else if (startAmount == 0){
			System.out.println ("You lose :(");
			
		
		
	}

}
}
