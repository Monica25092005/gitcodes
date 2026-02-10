//========= to achieve abstraction by using multilevel inheritance========//

abstract class fruit{
    abstract public void getJuice();
}
abstract class Apple extends fruit{

}
class Mango extends Apple{
    public void getJuice(){
        System.err.println("Mango Juice");
    }
}
public class Abstraction2 {
    public static void main(String[] args) {
        // Apple a=new Apple() ; //cte
        Mango m=new Mango();
        m.getJuice();//Mango juice
        
        };
    }

