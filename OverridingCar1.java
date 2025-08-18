import java.util.*;
class car{
    void race(){
        System.out.println("car is rasing");
    }
}
class Ferrari extends car{
    @Override
    void race(){
        System.out.println("Ferrari races with blazing speed");
    }
}
class Lamborghini extends car{
    void race(){
        System.out.println("Lamborghini races with roaring power");
    }
}
class Tesla extends car{
    void race(){
        System.out.println("Tesla racing silentlywith electric power");
    }
}




public class OverridingCar1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of cars");
        int n=sc.nextInt();
        System.out.println("Enter The car name");
        String a;
        sc.nextLine(); 
        car b=null; 
      ArrayList<String> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            a=sc.nextLine().toLowerCase();
            l1.add(a);
        
            if(a.equalsIgnoreCase("Ferrari")){
              b=new Ferrari();
            }
            else if(a.equalsIgnoreCase("Lamborghini")){
              b=new Lamborghini();
         }
       else  if(a.equalsIgnoreCase("Tesla")){
              b=new Tesla();
         }
        else if(a.equalsIgnoreCase("car")){
              b=new car();
         }
        else{
            System.out.println("Invalid input");
        }
        if(b!=null){
            b.race();
        }
    }      
    
}
}