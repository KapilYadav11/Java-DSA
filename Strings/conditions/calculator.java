import java.util.*;
public class calculator{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter the operator : ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break; 
            case '*' : System.out.println(a*b);
                        break; 
            case '%' : System.out.println(a%b);
                        break;
            default  : System.out.println("Some wrong operators are there");
        }


        // leap-year question=>
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if((year % 400 == 0) || (year % 4 == 0 && year % 100 !=0 )){
            System.out.println(year + " is a leap year");
           } else{
                System.out.println(year + " is a not leap year");
            }
        }
    }
