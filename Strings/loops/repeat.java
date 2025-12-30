import java.util.*;
public class repeat{
    public static void main(String args []){
        int counter = 0;
        while(counter<2){
            System.out.println("hello world");
            counter ++;
        }
        System.out.println();


        // Question=> print number from 1 to 100
        int count = 1;
        while(count<=4){
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        // Question => print numbers from 1 to n
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value:");
        int range = sc.nextInt();
        int county = 1;
        while(county <= range){
            System.out.print(county+ " ");
            county++;
        }
        System.out.println();


        // question => print sum of first n natural numbers
        System.out.print("Enter the value for the sum: ");
        int m = sc.nextInt();
        int sum = 0;
        int i=1;
        while(i <= m){
            sum = sum + i;
            i++;
        }
        System.out.println("sum is : " + sum);
    }
}