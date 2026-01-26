abstract  class E{
    abstract void show();
}
abstract class A extends E{
    abstract void print();
}
class B extends A{
void show(){
   System.out.print("E");
}
void print(){
     System.out.println("A");
}

}

public class Demo5 {
public static void main(String[] args) {
    E e=new B();
    e.show();

    A a=new B();
    a.print();
}
}
