import java.util.*;
public class factoo{
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    public static int binCoeff(int n, int r){  //binCoeff is Binomial Coefficient 
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r); //nmr in which the m is minus=>(n-r)

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String args []){
        System.out.println(binCoeff(5, 2));
        //System.out.println(factorial(5));

    }
}


// 0! is 1
// and the factorial exist only for the positive numbers