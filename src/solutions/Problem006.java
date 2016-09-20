package solutions;

/**
 * 
 * Finds sum of 1 to 100 squared minus sum of squares up to 100
 * 
 * @author Aditya Durvasula
 *
 */
public class Problem006 {
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum -= i * i;
		}
		sum += 5050 * 5050;
		System.out.println(sum);
	}
}
