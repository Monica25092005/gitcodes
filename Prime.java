// write the logic to find the next immediate prime number after a given input,

   import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nextPrime = n + 1; // start checking from next number

        while (true) {
            boolean isPrime = true;

            if (nextPrime <= 1) {
                isPrime = false;
            } else {
                // check divisibility from 2 to nextPrime-1
                for (int i = 2; i < nextPrime; i++) {
                    if (nextPrime % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(nextPrime);
                break; // stop once we find the next prime
            }

            nextPrime++; // move to the next number
        }
    }
}
