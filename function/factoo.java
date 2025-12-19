import java.util.*;
public class factoo{
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String args []){
        System.out.println(factorial(5));

    }
}


// 0! is 1
// and the factorial exist only for the positive numbers