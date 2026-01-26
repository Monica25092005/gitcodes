 abstract class Test1{
    public int a;
    Test1(){
        a=20;
    }
    abstract public void set(int a);
    abstract public void get();

 }
 
 
 class Demo4 extends Test1 {
    
    // compliler will create a constructor to Demo4 class
    // Demo4(){
    // super();
    // }
   
    public void set(int a){
        this.a=a;
    }
    public void get(){
        System.out.println("a="+a);
    }
    public static void main(String[] args) {
        Demo4 obj=new Demo4();
        obj.set(20);
        obj.get();
    }
}
