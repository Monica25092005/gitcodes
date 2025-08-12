import java.util.*;
public class Vector2 {
    public static void main(String[] args)
{
Vector<Integer> in=new Vector<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of element");
int n=sc.nextInt();

for(int i=0;i<n;i++){
in.add(sc.nextInt());
}
System.out.println(in);

//update 
in.set(0,3);
System.out.println("updated element:" +in);

in.remove(2);
System.out.println("After removed element in index 2:" +in);

System.out.println("Search the element in the array list");
int search=sc.nextInt();
 
   if(in.contains(search))
{
    System.out.println("search value is founded");

}
    else{
    System.out.println("not founded");
}
}}
