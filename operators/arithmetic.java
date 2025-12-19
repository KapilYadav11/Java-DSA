import java.util.*;
public class arithmetic{
    public static void main(String args []){
        int a = 10;
        int b = 5;
        System.out.println("add " + a+b);
        System.out.println("multiplly " + a*b);
        System.out.println("divide " + a/b);
        System.out.println("substract " + (a-b));
        System.out.println("modulo: " + a%b);

        // pre-increment-unary
        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);

        //post increment
        int e = 15;
        int f = e++;
        System.out.println(e);
        System.out.println(f);

        //pre-decrement
        //post-decrement
    }
}