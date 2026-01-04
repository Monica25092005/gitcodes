import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---- Welcome to Food Corner ----");
        System.out.println("1. Pizza - Rs.150");
        System.out.println("2. Burger - Rs.100");
        System.out.println("3. Sandwich - Rs.80");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You ordered Pizza ");
                System.out.println("Price: Rs.150");
                break;

            case 2:
                System.out.println("You ordered Burger ");
                System.out.println("Price: Rs.100");
                break;

            case 3:
                System.out.println("You ordered Sandwich ");
                System.out.println("Price: Rs.80");
                break;

            case 4:
                System.out.println("Thank you! Visit again ");
                break;

            default:
                System.out.println("Invalid choice ");
        }

        sc.close();
    }
}