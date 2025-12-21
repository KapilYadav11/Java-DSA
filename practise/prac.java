import java.util.*;
public class prac{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // Q.1 Write a program to store two integers and print their sum, difference, product, and quotient
        // int a = 5;
        // int b = 17;
        // int sum = a+b;
        // int product = a*b;
        // int difference = a-b;
        // int divide = b/a;
        // int quotient = b % a;
        // System.out.println(quotient);

        // Q.2 Take a radius as input and calculate the area and circumference of a circle.
        System.out.println("Enter the radius");
        int rad = sc.nextInt();
        double area = Math.PI * Math.pow(rad,2);
          System.out.println("Area of the circle is :" + area);
    }
}