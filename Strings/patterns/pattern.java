import java.util.*;
public class pattern{
    public static void main(String args []){
        //THIS CODE FOR THE PRINT OF THE STAR
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number for star");
        // int n = sc.nextInt();
        // for(int line = 1; line<=n; line++){
        //     for(int star= 1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //}





        //THIS CODE IS FOR THE INVERTED STAR PRINTED BELOW
        // int n = 4;
        // for(int line =1; line <=n; line++){
        //     for(int star = 1; star<= n-line+1; star++ ){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }



        //CODE FOR PRINTING THE CHARACTER 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        char ch = 'A';
        for(int line = 1; line<=n; line ++){
            for(int chars = 1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}