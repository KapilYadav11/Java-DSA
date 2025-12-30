import java.util.*;
public class SelectionSort {
    public static void selectionArr(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPosition = i; //Man lo abhi ith position pe hi sabse chhota element hai.
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPosition] > arr[j]){
                    minPosition = j;
                }
                
            }
             int temp = arr[minPosition];
             arr[minPosition] = arr[i];
             arr[i] = temp;
        }
    }
        public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionArr(arr);
        printArr(arr);

    }
}
