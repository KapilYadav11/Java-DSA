import java.util.*;
public class BubbleSort{
    public static void sortedArr(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {

            boolean swapped = false; // assume is baar swap nahi hoga

            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) { // agar galat order mein hain
                    // swap kardo
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // swap hua, matlab abhi fully sorted nahi tha
                }
            }

            // agar poore turn mein ek bhi swap nahi hua
            if (!swapped) {
                break; // array already sorted hai, aage ke turns ki need nahi
                
            }
           
        }
        
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,5, 6, 7, 8, 9};
        sortedArr(arr);
        printArr(arr);
    }
}




    // this is the code for the unsorted array
//     public static void sortedArr(int arr[]){
//         for(int turn=0; turn<arr.length-1; turn++){

//             for(int j=0; j<arr.length-1-turn; j++){
//                 if(arr[j] > arr[j+1]) { //Yeh check karti hai ki current element next element se bada hai ya nahi.
//                     //swap kardo fir

//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                 }
//             }
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {4,9,3,7,2,6,1,8,5};
//         sortedArr(arr);
//         printArr(arr);
//     }
