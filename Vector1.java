import java.util.Scanner;
import java.util.Vector;
public class Vector1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        Vector<Integer> numbers=new Vector<>();

        System.out.println("Enter numebr of element:");
        int n=sc.nextInt();

        System.out.println("Enter Element");
        for(int i=0;i<n;i++) 
        {
            numbers.add(sc.nextInt());
        }
         System.out.println("Vector element:" +numbers);
        //  System.out.println("Enter index value:");

        //search
        System.out.println("Enter value to search:");
        int searchValue=sc.nextInt();
        if(numbers.contains(searchValue)){
            System.out.println("Elemnent found:");

        }
        else{
            System.out.println("Elemnent found:");
        }
         System.out.println("First found:"+numbers.firstElement());
         System.out.println("last found:"+numbers.lastElement());
         numbers.lastElement();
         System.out.println("Vector Element:"+numbers);
    }
}
