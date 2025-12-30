import java.util.*;
public class SubArray{
    public static void printSubArray(int numbers[]){
        int sum  = 0;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                for(int k = start; k<= end; k++){
                    System.out.print(numbers[k]+ " " );
                    //System.out.println(numbers[i] + numbers[j] + numbers[k]);
                }
                System.out.println();
            }
           
        }
    }
    public static void main(String [] args){
        int numbers[] = {10,20,30,40};
        printSubArray(numbers);
    }
}