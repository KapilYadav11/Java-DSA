// Keep entering number till user enters a multiple of 10
import java.util.*;
public class doowhile{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the number:");
             int n = sc.nextInt();
             if(n % 10 ==0){
             break;
        }
         System.out.print(n);
        } while(true);
       
        }
        
    }





// public class doowhile{
//     public static void main(String args []){
//         int counter = 1;
//         do{
//             System.out.println("hello world");
//             counter++;
//         } while (counter <=5);


//         //BREAK SATEMENT;
//          for(int i = 1; i<=5; i++){
//             if(i==4){
//                 break;
//             }
//             System.out.println(i);
//          }
//          System.out.println("i am out of the loop");
//     }
// }