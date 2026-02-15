// Count the Primes in a Range
// Two whole numbers N1 and N2 are passed as input. The program must print the number of prime numbers present between N1 and N2 (the range is inclusive of both N1 and N2).

// Input Format:
// - The first line will contain the value of the first number N1.
// - The second line will contain the value of the second number N2.
// Output Format:
// - The first line will contain the count of prime numbers between N1 and N2.
// Boundary Conditions:
// - 1\leq N1,N2\leq 999999

// Example Input/Output 1:

import java.util.*;

public class CountPrimesInRange {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        
        // Check divisibility from 2 to num-1 (simple version)
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        int count = 0;

        // Loop through the range
        for (int i = N1; i <= N2; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println(count);
    }
}