import java.util.*;
class Animal{
    void sound(){
        System.out.println("animals makes a sound");
    }

}
class dog extends Animal{
    @Override
    void sound(){
        System.out.println("bow bow");
    }

}
class cat extends Animal{
    @Override
    void sound(){
        System.out.println("mewo mewo");
    }
}
class lion extends Animal{
    @Override
    void sound(){
        System.out.println("grr grr");
    }
}

public class overriding1{
public static void  main(String [] args){
    Scanner sc=new Scanner(System.in);
    String animal=sc.nextLine();
    Animal a=null;//we don’t yet know what type of animal the user will input.

    if(animal.equalsIgnoreCase("dog")){
        a=new dog();
    }
     else if(animal.equalsIgnoreCase("cat")){
      a=new cat();
    }
    else if(animal.equalsIgnoreCase("lion")){
        a=new lion();
    }
    else if(animal.equalsIgnoreCase("animal")){
       a=new Animal();
    }
    
    else{
        System.out.println("Invalid input");
    }
     if(a!=null){
     a.sound();
}
}
}