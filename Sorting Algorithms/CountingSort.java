import java.util.*;

public class CountingSort {
    
    public static void countingArr(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
            // Yeh line check karti hai ki arr[i] (current element) aur largest me se kaun bada hai.
        }

        int count[] = new int[largest + 1]; // [largest+1] isliye kyunki -- jaise ki humara largest 3(example) hai +1 isliye taaki humare slot + ho jaye matlab total indice 1 extra ho jaye
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            // count[arr[i]]++ — count ko ek se badha do
            // Iska kaam hai frequency track karna — har number kitni baar aaya
            // arr[i] — array ka current element
        }

        // sorting
        int j = 0; // Output position tracker
        for (int i = 0; i < count.length; i++) { // 0 se largest tak chalega
            while (count[i] > 0) { // Jab tak count hai
                arr[j] = i; // i ko position j pe daalo
                j++; // Next position
                count[i]--; // Count kam karo
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
        int arr[] = {1, 4, 1, 3, 2, 4, 3};
        System.out.print("Before: ");
        printArr(arr);
        
        countingArr(arr);
        
        System.out.print("After:  ");
        printArr(arr);
    }
}
