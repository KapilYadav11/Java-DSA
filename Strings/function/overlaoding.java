import java.util.*;
public class overlaoding{
    // public static int sum(int a, int b){
    //     return a + b;

    // }
    // public static int sum(int a ,int b , int c){
    //     return a + b + c;
   // }
       public static int sum(int a, int b){
        return a + b;
       }
       public static float sum(float a, float b){
        return a + b;
       }



       public static boolean isPrime(int n){
         for(int i = 2; i<=n-1; i++){
            if(n % i == 0){
                return false;
            }
         }
         return true;
       }
    public static void main(String [] args){
        System.out.println(isPrime(13));


    }
        // System.out.println(sum(8,2));
        // System.out.println(sum(3.5f, 3.5f));
        // System.out.println(sum(5,9));
        // System.out.println(sum(7,8,9));
    }









// i have given the file name with some spelling mistakes bcoz in java some words are reserved