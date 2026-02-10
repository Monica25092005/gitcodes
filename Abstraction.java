abstract class Vehicle{ //abstract clss/incomplete class
    abstract public void getVehicle(); //abstract method / incomplete method
}
class Bike extends Vehicle{ //concrete class /cpmplete class
public void getVehicle(){ //concrete method 
System.out.println("RX");
}
}
public class Abstraction {
    public static void main(String[] args) {
        // Vehicle v1=new Vehicle();//CTE -->we cant create a object for abstract cls
       Bike b1=new Bike();
       b1.getVehicle();
    }
}
