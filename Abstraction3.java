abstract class Laptop{
    Laptop(){
        System.out.println("from Laptop");
    }
    public void M1(){
        System.out.println("Hello");
    }
    abstract public void M2();
}
class Dell extends Laptop{
    public void M2(){
        System.out.println("Welcome");
    }
    Dell(){
        //super(); ->1st it calls the parent cls when the objct created to the child class this constructor calling a super class implicitly with the help of compiler
        System.out.println("from dell");
    }
}

public class Abstraction3 {
 public static void main(String[] args) {
     Dell d1=new Dell();
     d1.M1();
     d1.M2();
 }   
}
