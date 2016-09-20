package solutions;
/**
 * 
 * Finds sum of even fibonacci numbers under 4 million
 * 
 * @author Aditya Durvasula
 *
 */
public class Problem2 {
	static int sum = 0;
	
	public static void main(String args[]) {
		fib(1, 1);
		System.out.println(sum);
	}
	
	public static void fib(int first, int second) {
		if(second >= 4000000) {
			return;
		}
		if(second % 2 == 0) {
			sum += second;
		}
		fib(second, second + first);
	}
}
