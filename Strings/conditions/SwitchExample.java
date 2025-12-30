import java.util.*;
public class SwitchExample{
    public static void main(String args[]){
        char ch = 'b';
        switch(ch){
            case 'd' : System.out.println("samosa");
                       break;
            case 'b' : System.out.println("Apple");
                       break;
            case 'a' : System.out.println("banana"); 
                       break;
            default : System.out.println("Anything");          
        }
    }
}