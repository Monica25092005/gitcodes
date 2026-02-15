// You’re given a string S (only lowercase letters, length between 3 and 100).
// The task: print the characters of S in descending alphabetical order.


import java.util.*;

public class DescendingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  // read the string
        
        // Convert string to character array
        char[] chars = s.toCharArray();
        
        // Sort in descending order
        Arrays.sort(chars);  // sorts ascending
        StringBuilder sb = new StringBuilder(new String(chars));
        sb.reverse();        // reverse to get descending
        
        // Print result
        System.out.println(sb.toString());
    }
}