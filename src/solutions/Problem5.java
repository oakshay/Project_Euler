package solutions;

/**
 * 
 * Finds smallest number divisible by all integers from 1 to 20
 * Much faster than brute force search
 * 
 * @author Aditya Durvasula
 *
 */
public class Problem5 {
	public static void main(String args[]) {
		long cur = 1;
		for(int i = 1; i <= 20; i++) {
			if(cur % i > 0) {
				for(int j = 1; j <= 20; j++) {
					if((cur * j) % i == 0) {
						cur *= j;
						break;
					}
				}
			}
		}
		System.out.println(cur);
	}
}
