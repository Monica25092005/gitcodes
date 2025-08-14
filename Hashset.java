import java.util.HashSet;
import java.util.Scanner;

public class Hashset {
    public static void main(String[] args) {
        {
//             HashSet <String> names=new HashSet<>();
//             Scanner sc=new Scanner(System.in);
//             int n =sc.nextInt();

//             sc.nextLine();
//             System.out.println("enter your names");
//             for(int i=0;i<n;i++){
//                 String name=sc.next();

//             if(names.add(name))
//         {
//             System.out.println("Added:"+name);

//         }
//         else{
//             System.out.println("Duplicate ignored:"+name);
//         }

//     }
//      names.add("ram");
//      System.out.println("hash set values");
//      for(String i:names){
//         System.out.println(i);
//      }
//      System.out.println(names);
//      names.remove("moni");
//      System.out.println("After removing moni"+names);
//      System.out.println("Size of a set:"+names.size());
//         }
//     }
// }
HashSet <String> names=new HashSet<>();
            Scanner sc=new Scanner(System.in);
            int n =sc.nextInt();

            sc.nextLine();
            // System.out.println("enter your names");
            for(int i=0;i<n;i++){
                String name=sc.next();
            names.add(name);
            }
            System.out.println(names.size());
        }
    }
}
