 class Ram {
    public void property(){
        System.out.println("gold+house+money");
    }
    public void Marriage(){
        System.out.println("Hey sheela,please marry bharath");
    }
}
class Sheela extends Ram{
    public void Marriage(){
        System.out.println("No appa,i will marry shambu sir");
    }
}
public class MethodOverridingRam{
    public static void main(String[] args){
        Ram r1=new Sheela();
        r1.property();
        r1.Marriage();
    }
 }