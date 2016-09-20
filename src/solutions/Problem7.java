package solutions;

/**
 * 
 * Uses DP to store list of primes to test numbers on
 * Much more efficient that brute force
 * 
 * @author Aditya Durvasula
 *
 */
public class Problem7 {
	static long[] primes = new long[10001];
	static int currentIndex = 0;
	
	public static void main(String args[]) {
		primes[0] = 2;
		currentIndex++;
		for(long i = 3; ; i+=2) {
			if(isPrime(i)) {
				primes[currentIndex++] = i;
			}
			if(currentIndex == 10001) {
				System.out.println(primes[10000]);
				return;
			}
		}
	}
	public static boolean isPrime(long n) {
		for(int i = 0; primes[i] <= Math.sqrt(n) && primes[i] != 0; i++) {
			if(n % primes[i] == 0) {
				return false;
			}
		}
		return true;
	}
}
 