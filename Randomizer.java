import java.util.Random;



public class Randomizer {
	private int intRandom;
	private double doubleRandom;
	Random random = new Random();
	
	public int getRandomInt(int bound) {
		this.intRandom = random.nextInt();
			return this.intRandom;
	}
	
	public double getRandomDouble(double bound) {
		this.doubleRandom = random.nextDouble();
			return this.doubleRandom;
	}
}
