import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int i = getRandomNumberInRange(1, 6); 
		System.out.println(i);

	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
