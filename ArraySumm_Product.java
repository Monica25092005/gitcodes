public class ArraySumm_Product {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int sum=0;
        int prod=1;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            prod=prod*a[i];
        }
        System.out.println("sum of element:"+sum);
         System.out.println("prod of element:"+prod);

    }
}
