public class Reverse {
    public static void main(String[] args) {
        int n=123;
        int r=0;
        while(n!=0){
        for(int i=1;i<=n;i++){
            r=n%10;
            System.out.print(r);
            n=n/10;
        }
    }
}
}
