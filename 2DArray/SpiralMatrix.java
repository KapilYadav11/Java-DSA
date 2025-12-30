import java.util.*;
public class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1; //n-1 (see in copy for revesion of logic)
        int endCol = matrix[0].length-1; // m-1
        //matrix[0].length Java mein 2D array (matrix) ke pehli row (index 0 wali row) mein kitne columns (elements) hain, uska count deta hai

        while (startRow <= endRow && startCol <= endCol ) {
            // top k liye
            for(int j = startCol; j<= endCol; j++){ // j hum column k liye use kar rahe hai
                System.out.println(matrix[startRow][j]+" ");
            }

            // right k liye
            // i row k liye use kar rahe hai
            for(int i =startRow+1; i<=endRow; i++){
                System.out.println(matrix[i][endCol]+" ");
            }

            // bottom
            for(int j = endCol-1; j>= startCol; j--){
                 if(startRow == endRow){
                    break;
                }
                System.out.println(matrix[endRow][j]+" ");
               
            }

            // left 
            for(int i=endRow-1; i>=startRow+1; i--){
                 if(startCol == endCol){
                    break;
                }
                System.out.println(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
            
        }
        System.out.println(); 


    }
    public static void main(String[] args) {
        int matrix [][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        printSpiral(matrix);
    }
    
}
