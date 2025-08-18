import java.util.*;
class Calculator{
  public  int add(int a,int b){
    return a+b;
}
 public int add(int a,int b,int c){
  return a+b+c;
}
public double add(double a,double b){
    return a+b;
}
}



public class polymorphism1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Calculator c=new Calculator();
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    System.out.println(c.add (a,b));
    System.out.println(c.add(5,10));//arg method
    System.out.println(c.add(5,10,15));
    // System.out.println(c.add (a,b));
    }
}
    

