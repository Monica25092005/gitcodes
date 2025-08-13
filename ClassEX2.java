import java.util.*;
class Car{
    String brand;
    int year;
    void display(){
        System.out.println("car brand:" +brand);
        System.out.println("car year:" +year);
    }
}
class Electric_Car extends Car{
    int batterycapacity; 

    void electricdisplay(){
        display();
        System.out.println("Battery capcity:"+batterycapacity+"kwh");
    }
    
}

public class ClassEX2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Electric_Car e1=new Electric_Car();

        System.out.println("Enter car brand:");
        e1.brand=sc.nextLine();
        e1.year=sc.nextInt();

        System.out.println("Enter car Battery Capacity:");
        e1.batterycapacity=sc.nextInt();

        
        e1.electricdisplay();
    }
}
