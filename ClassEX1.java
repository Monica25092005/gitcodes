import java.util.*;
class Car{
    String brand;
    int year;
    void display(){
        System.out.println("car brand:" +brand);
        System.out.println("car year:" +year);
    }
}

public class ClassEX1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car c1=new Car();

        System.out.println("Enter car brand:");
        c1.brand=sc.nextLine();

        System.out.println("Enter car year:");
        c1.year=sc.nextInt();

        c1.display();
    }
}
