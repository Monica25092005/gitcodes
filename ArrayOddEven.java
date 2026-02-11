public class ArrayOddEven {
    public static void main(String[] args) {
        int[] a={4,1,6,7,8};
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println("even---->"+a[i]);
            }
            else{
                 System.out.println("odd---->"+a[i]);
            }
        }
    }
}
