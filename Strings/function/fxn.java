import java.util.*;
public class fxn{
    public static void printHello(){
      
    }

    public static int calculateSum(int a , int b){
       int sum = a +  b;
       return sum;

    }

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static int multi(int a, int b){
        int pro = a * b;
        return pro;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of the a");
        // int a = sc.nextInt();
        // System.out.println("Enter the value of the b");
        // int b = sc.nextInt();
        // int sum =  calculateSum(a , b);
        // System.out.println("the sum of the values is " + sum);

       
    //    System.out.println("Enter the value of the a:");
    //    int a = sc.nextInt();
    //    System.out.println("Enter the value of the b:");
    //    int b  = sc.nextInt();
    //    int product = multiply(a, b);
    //    System.out.println("a * b is " + product);


    int a = 8;
    int b = 7;
    int pro = multiply(a,b);
    System.out.println("a * b " + pro);
     pro = multiply(5,9);
    System.out.println(("a * b is :" + pro));
     pro = multiply(5,3);
    System.out.println(("a * b is :" + pro));

       

    }
}