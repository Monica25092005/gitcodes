// Rotate String – N Positions
// A string S of length L is passed as the input. The program must rotate the string S by N positions in the forward direction and print the result as the output.

// Input Format:
// - The first line will contain the value of S.
// - The second line will contain N.
// Output Format:
// - The first line will contain the rotated string value.
// Boundary Conditions:
// - The length L of the string S is from 3 to 100.
// - 0\leq N\leq L

import java.util.*;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        
        int L = s.length();
        
        // Normalize N in case it's equal to length
        n = n % L;
        
        // Rotate string by slicing
        String rotated = s.substring(L - n) + s.substring(0, L - n);
        
        System.out.println(rotated);
    }
}
