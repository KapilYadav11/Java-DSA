import java.util.*;
public class SubString {
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str ="KaiseHoApp";
        System.out.println(substring(str, 0, 5));
    }
}



//this whole code can be also done in 2 line of code
// String str = "HelloWorld";
// System.out.println(str.substring(0, 5));
