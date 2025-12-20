import java.util.*;
public class primee{
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
    for(int i = 2; i<=Math.sqrt(n); i++){
        if(n % i == 0){
            return false;
        }
    }
    return true;
}
public static void primeInRange(int n){
    for(int i = 2; i<=n; i++){
        if(isPrime(i)){
            System.out.println(i+" ");
        }
    }
    System.out.println();
}
public static void main(String [] args){
    primeInRange(20);
  }
}
// the above program checks the prime number in the range





// the below code checks only the number is prime or not
// import java.util.*;
// public class primee{
//     public static boolean isPrime(int n){
//         if(n == 2){
//             return true;
//         }
//     for(int i = 2; i<=Math.sqrt(n); i++){
//         if(n % i == 0){
//             return false;
//         }
//     }
//     return true;
// }
// public static void main(String [] args){
//     System.out.println(isPrime(12));
//   }
// }



// optimized method to find the prime number
// primee file is given due java case senstive