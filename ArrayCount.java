//count the odd & even number present in an array
public class ArrayCount {
    public static void main(String[] args) {
        int[] a={4,1,6,7,8};
        int evenElement=0;
        int oddElement=0;

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                evenElement++;
            }
            else{
                oddElement++;
            }
        }
         System.out.println("evenelement:"+evenElement);

          System.out.println("oddelement:"+oddElement);
    }
}
