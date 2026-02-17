import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int original=N;
        int reverse=0;
        while(N!=0){
         int digit =N%10;
         reverse =reverse*10+digit;
         N=N/10;}
       if(original==reverse){
        System.out.println("palindrome");
       
       }
    else{
         System.out.println("not palindrome");
    }
    }

}
