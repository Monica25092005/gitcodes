// A string S (only alphabets) is passed as input.
// The printed output should contain alphabets in odd positions in each word in uppercase and alphabets in even positions in each word in lowercase.

// Input Format:
// - The first line will contain S.
// Output Format:
// - The first line will contain the resultant string value based on the conditions provided.
// Boundary Conditions:
// - Length of S is from 3 to 100.




import java.util.*;

public class OddEvenCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        // Split the string into words
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            StringBuilder transformed = new StringBuilder();
            
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                
                // Odd position (1-based index) → uppercase
                if ((i + 1) % 2 != 0) {
                    transformed.append(Character.toUpperCase(c));
                } 
                // Even position → lowercase
                else {
                    transformed.append(Character.toLowerCase(c));
                }
            }
            
            result.append(transformed).append(" ");
        }
        
        // Print final result (trim to remove extra space)
        System.out.println(result.toString().trim());
    }
}