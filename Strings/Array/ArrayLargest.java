import java.util.*;
public class ArrayLargest{
    public static int largestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
       }
       System.out.println("Smallest value is: " + smallest);
       return largest;
    }
    public static void main(String [] args){
        int numbers[] = {8, 9, 5, 6, 3, 2};
        System.out.println("largest value is : " + largestNumber(numbers));
    }
}



// O(n) worst complexity , because the loop is run up to the number of the element