public class Solution {
	public static int findNthPrime(int n) {
		if (n == 1) return 2;

        // Initialize an array to mark non-prime numbers
        boolean[] isPrime = new boolean[1000000];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes algorithm
        int count = 0;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                count++;
                if (count == n) return i; // Found the Nth prime number

                // Mark all multiples of i as non-prime
                for (int j = i * 2; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        return -1; 
	}
}

Sieve of Eratosthenes algo

TC: O(N log(log N))
