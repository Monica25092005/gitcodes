//======To achieve by using hierarchical inheritance=====//

abstract class Bank1
{
abstract public void getRateofIntrest();
}
class SBI extends Bank1{
    public void getRateofIntrest(){
        System.err.println(7);
    }
}
class ICICI extends Bank1{
    public void getRateofIntrest(){
        System.err.println(10);
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        // Bank1 b1=new Bank1();//CTE
        SBI s=new SBI();
        s.getRateofIntrest();

        ICICI i=new ICICI();
        i.getRateofIntrest();
        
    }
}
