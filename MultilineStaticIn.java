public class MultilineStaticIn {  //class movie
    static String lang="tamil";
    static{
        System.out.println("Welcome to vetri theater");

    }
    static double ticketprice ;
    
    public static void main(String[] args) {
        System.out.println("main start");
        msg();
        System.out.println(ticketprice);
        int a=10;
        System.out.println(a);
        System.out.println("main end");


    }
    public static void msg(){
        System.out.println("jailer");
    }

}
