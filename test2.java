public class test2 {
    String name;
    int age;

    void Tname(){  //we can access non static variable into non static method without any object creation
        System.out.println(name);
    }
    public static void main(String[] args){
       test2 t2=new test2();
       t2.Tname();
    }
}
