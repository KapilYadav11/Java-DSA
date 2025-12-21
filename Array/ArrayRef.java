import java.util.*;
public class ArrayRef{
    public static void updatedMarks(int marks[]){
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 10;
        }
    }
    public static void main(String [] args){
        int marks[] = {70,80,90};
        updatedMarks(marks);

        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i] + "");
        }
        System.out.println();
    }
}