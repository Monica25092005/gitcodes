import java.util.Scanner;
public class SumProdFactor {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0,prod=1;
        for (int i = 1; i <=N; i++) {
            if(N%i==0){
                sum+=i;
                prod*=i;
            }
        }
        System.out.println(sum);
        System.out.println(prod);

    }
}
