//the summ and product of odd and even elements present ina na array
public class Arrayele {
    public static void main(String[] args) {
        int[] a={4,1,6,7,8};
        int sumofOdd=0,prodofOdd=1,sumofEven=0,prodofEven=1;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                sumofEven+=a[i];
                prodofEven*=a[i];
            }
            else{
                sumofOdd+=a[i];
                prodofOdd*=a[i];
            }
        }
        System.out.println(sumofEven);
          System.out.println(prodofEven);
            System.out.println(sumofOdd);
              System.out.println(prodofOdd);



    }
}
