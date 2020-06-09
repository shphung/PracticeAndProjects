package Math;
/*
 * Leetcode Practice: #204. Count Primes
 * 
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 * Example:
 * 	Input = 10
 *	Output: 4
 *	Explanation: There are 4 prime numbers less than 10, they are:
 *		2, 3, 5, 7.
 */
public class CountPrimes {

	public static void main(String[] args) {
		System.out.println(countPrimes(10));

		System.out.println(countPrimes(2));
		
		System.out.println(countPrimes(10000));
		
		System.out.println(countPrimes(499979));
	}

	public static int countPrimes(int n) {
		int numOfPrimes = 0;
		for(int i = 2; i < n; i++) {
			if(isPrime(i)) {
				numOfPrimes++;
			}
		}
		return numOfPrimes;
	}
	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
