// Square Matrix – Corner Elements Sum
// A square matrix of size N × N is passed as the input. The program must calculate and print the sum of the elements in the four corners of the matrix.

// Input Format:
// - The first line will contain the value of N.
// - The next N lines will contain the N values separated by one or more spaces.
// Output Format:
// - The first line will contain the integer value denoting the sum of the elements in the corners.

import java.util.*;

public class Square  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[][] matrix = new int[N][N];
        
        // Read matrix values
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Calculate sum of corners
        int sum = matrix[0][0]                  // top-left
                + matrix[0][N-1]                // top-right
                + matrix[N-1][0]                // bottom-left
                + matrix[N-1][N-1];             // bottom-right
        
        System.out.println(sum);
    }
}