package solutions;

/**
 * 
 * Finds largest prime factor of 600851475143
 * 
 * @author Aditya Durvasula
 *
 */
class Problem003 {
	public static void main(String args[]) {
		long num = 600851475143L;
		System.out.println(getLargestPrimeFactor(num));
	}
	public static long getLargestPrimeFactor(long num) {
		long maxPrimeFactor = 1;
		for(long i = 3; i < Math.sqrt(num); i+=2) {
			if(num % i == 0) {
				if(isPrime(i)) {
					maxPrimeFactor = i;
				}
			}
		}
		return maxPrimeFactor;
	}
	public static boolean isPrime(long num) {
		for(int i = 3; i < Math.sqrt(num); i+=2) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
