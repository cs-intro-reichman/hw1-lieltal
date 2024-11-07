// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * limit);
		int b = (int)(Math.random() * limit);
		int c = (int)(Math.random() * limit);

		int maxNumber = (int)Math.max(Math.max(a, b), c);
		int minNumber = (int)Math.min(Math.min(a, b), c);
		int middleNumber = a + b + c - minNumber - maxNumber;

		System.out.println(maxNumber + " " + middleNumber + " " + minNumber);
 	}
}
