import java.util.*;
public class StringCre {
    public static void printLetters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
    }
  
    public static void main(String[] args) {
        // char arr[] = { 'a' , 'b', 'c', 'd'};
        // String str = "asdf";
        // String str2 = new String("xyK@123545z");



        // Scanner sc = new Scanner(System.in);
        // String name;
       // name = sc.nextLine();
        //System.out.println(name);



        // String fullName = "KAPIL YADAV";
        // System.out.println(fullName.length());


        //concatenation
        String firstName = "Kapil";
        String lastName = "Yadav";
        String fullName = firstName + " " + lastName;
       // System.out.println(fullName);
        //System.out.println(fullName.charAt(7));


        printLetters(fullName);
    }
    
}


// strings are IMMUTABLE means they can not be change , when we want to  chnage them we have create a new string with the different name  