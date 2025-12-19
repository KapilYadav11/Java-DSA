import java.util.*;
public class foor{
    public static void main(String args []){
        for(int i = 1; i<=5; i++)
        System.out.println("hello ");

        System.out.println();
        System.out.println();


        // Print the square pattern using the for loop
        for(int line=1; line<=4; line++){
            System.out.println("****");
        }
        System.out.println();
        System.out.println();

        // print the reverse of the number
        int n = 10112003;
        while(n > 0){
            int lastDigit = n%10;
            System.out.print(lastDigit + " ");
            n = n / 10;
        }
        System.out.println(n);

        // reverse the number
        int m = 10112005;
        int rev = 0;
        while(m > 0){
            int lastDigit = m % 10;
            rev = (rev*10) + lastDigit;
            m = m / 10;
        }
        System.out.println(rev + " ");
    }
}