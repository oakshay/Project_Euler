package solutions;
/**
 * 
 * Finds sum of numbers divisible by 3 and 5 under 1000
 * 
 * @author Aditya Durvasula
 *
 */
public class Problem001 {
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 0; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
