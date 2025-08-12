
import java.util.*;
class Person {
    private String name;

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class class2 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Person p=new Person();
    System.out.println("Enter the name:");
    String inputname=sc.next();
    p.setName(inputname);

    System.out.println("Hello " +p.getName());
    }
}
