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
		System.out.println(isPrimes(10));
		System.out.println(isPrimes(17));
		System.out.println(isPrimes(5));
		System.out.println(isPrimes(101));
		System.out.println(isPrimes(13));
		
		int num = 10;
		System.out.println("\nFound: " + countPrimes(num) + " primes.");
		num = 2;
		System.out.println("\nFound: " + countPrimes(num) + " primes.");
		num = 10000;
		System.out.println("\nFound: " + countPrimes(num) + " primes.");
	}

	public static String isPrimes(int n) {
		int stoppingPoint = (int) Math.floor(Math.sqrt(n));
		for(int i = 2; i <= stoppingPoint; i++) {
			if(n % i == 0) {
				return n + " is not prime.";
			}
		}
		return n + " is prime.";
	}
	
	public static int countPrimes(int n) {
		int numOfPrimes = 0;
		for(int i = 2; i < n; i++) {
			if(isPrime(i)) {
				if(numOfPrimes % 20 == 0) {
					System.out.println();
				}
				System.out.print(i + "\t");
				numOfPrimes++;
			}
			
		}
		return numOfPrimes;
	}
	
	public static boolean isPrime(int n) {
		int stoppingPoint = (int) Math.floor(Math.sqrt(n));
		for(int i = 2; i <= stoppingPoint; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
