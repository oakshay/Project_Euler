package solutions;

/**
 * 
 * Finds largest palindrome that is product of two 3 digit numbers
 * 
 * @author Aditya Durvasula
 *
 */
public class Problem4 {
	public static void main(String args[]) {
		int max = 0;
		for(int i = 100; i < 1000; i++) {
			for(int j = i + 1; j < 1000; j++) {
				if(isPalindrome(i * j)) {
					max = Math.max(i * j, max);
				}
			}
		}
		System.out.println(max);
	}
	public static boolean isPalindrome(int i) {
		String x = i + "";
		for(int j = 0; j < x.length() / 2; j++) {
			if(x.charAt(j) != x.charAt(x.length() - j - 1)) {
				return false;
			}
		}
		return true;
	}
}
