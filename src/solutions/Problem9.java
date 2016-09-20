package solutions;

/**
 * 
 * Finds product of 3 pythagorean numbers that sum to 1000
 * 
 * @author Aditya Durvasula
 *
 */
public class Problem9 {
	public static void main(String args[]) {
		for(int i = 100; i < 1000; i++) {
			for(int j = 101; j < 1000; j++) {
				int k = 1000 - i - j;
				if(k <= 100) {
					continue;
				}
				if(i * i + j * j == k * k) {
					System.out.println(i * j * k);
					return;
				}
				if(j * j + k * k == i * i) {
					System.out.println(i * j * k);
					return;
				}
				if(i * i + k * k == j * j) {
					System.out.println(i * j * k);
				}
			}
		}
	}
}
