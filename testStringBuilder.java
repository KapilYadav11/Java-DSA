public class testStringBuilder {
    public static void main(String []args){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
             sb.append(ch);
        }
        System.out.println("total characters: " + ","+ sb+ ","+ " ");
       System.out.println("total number of characters are: " + sb.length());
    }
}
