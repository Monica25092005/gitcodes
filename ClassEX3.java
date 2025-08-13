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
        System.out.println("Battery capcity:"+batterycapacity+"kwh");
    }
    
}
class Child extends Electric_Car {
    int autopilotVersion;
     void Childdisplay(){
     display();
     electricdisplay();
        System.out.println("autopilot_version:" +autopilotVersion);
     }
}

public class ClassEX3 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Child ch1=new Child();

        System.out.println("Enter car brand & year:");
        ch1.brand=sc.nextLine();
        ch1.year=sc.nextInt();

        System.out.println("Enter car Battery Capacity:");
        ch1.batterycapacity=sc.nextInt();
        System.out.println("Enter autopilotVersion5:");
        ch1.autopilotVersion=sc.nextInt();
        
       ch1.Childdisplay();
    }
}
