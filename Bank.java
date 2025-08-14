
import java.util.Scanner;
public class Bank {
    static Scanner sc=new Scanner(System.in);
    static double balance=0; 

    public static void createAccount(){
         System.out.println("Welcome to simple bank!");
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Enter account number: ");
        int acc_no=sc.nextInt();
        System.out.println("Account created successfully");
        
    }
    public static void showMenu(){
        System.out.println("======MENU======");
        System.out.println("1.Deposite");
        System.out.println("2.withdraw");
        System.out.println("3.Check balance");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
    }
    public static void deposite()
    {
        System.out.println("Enter amount to deposite:");
        double amount=sc.nextDouble();
        if(amount>0){
            balance=balance+amount;
            System.out.println("Amount deposited successfully!");
        }
        else{
            System.out.println("Invalid amount");
        }

    }
    public static void withdraw(){
        System.out.println("Enter amount to withdraw:");
        double amount=sc.nextDouble();
        if(amount<0 && amount<=balance){
        balance=balance-amount;
        System.out.println("Enter amount to withdraw");
    }
    else{
        System.out.println("Invalid amount or insufficient balance");
    }
    }
    public static void checkbalance(){
        System.out.println("Current balance: " +balance);
    }

    public static void main(String[] args){
        createAccount();

        for(int i=1;i<5;i++){
            showMenu();
            int choice=sc.nextInt();

        switch (choice){

            case 1:
            deposite();
            break;

            case 2:
            withdraw();
            break;

            case 3:
            checkbalance();
            break;

            case 4:
           System.out.println("Thank you for using the bank application");
            break;

            default:
            System.out.println("INvalid choice.try again.");
        }

        }

}
    
}
