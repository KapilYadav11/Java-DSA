import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                // this condition for the not to palindrom
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        String str2 = "racetudcar";
        System.out.println(isPalindrome(str));
    }
    
}
