// programming problem about finding the Nth term in an arithmetic progression (AP) when the first three terms and N are given. Let’s break it down step by step so it’s crystal clear:

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        int N = sc.nextInt();
        
        int d = t2 - t1; // common difference
        int nthTerm = t1 + (N - 1) * d;
        
        System.out.println(nthTerm);
    }
}
