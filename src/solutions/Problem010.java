package solutions;

import java.util.ArrayList;

/**
 * 
 * Finds sum of all primes below 2 million
 * Uses DP too enhace prime checking
 * 
 * @author Aditya Durvasula
 *
 */
public class Problem010 {
	static ArrayList<Long> primes= new ArrayList<Long>();
	static long sum;
	
	public static void main(String args[]) {
		primes.add((long) 2);
		sum = 2;
		for(long i = 3; i < 2000000; i+=2) {
			if(isPrime(i)) {
				primes.add(i);
				sum += i;
			}
		}
		System.out.println(sum);
	}
	public static boolean isPrime(long n) {
		for(int i = 0; primes.get(i) <= Math.sqrt(n); i++) {
			if(n % primes.get(i) == 0) {
				return false;
			}
		}
		return true;
	}
}
