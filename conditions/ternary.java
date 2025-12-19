import java.util.*;
public class ternary{
    public static void main(String args []){
        int n = 25;
        String type = ((n%2)==0)? "even" : "odd";
        System.out.println(type);

        int marks = 26;
        String status = marks>=33? "pass" : "fail";
        System.out.println(status);
    }
}