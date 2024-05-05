package Interview;

public class ReverseWords {
    static void reverseWords(String s){
       String splitArray[] = s.split(" ");
       for(int i= splitArray.length-1; i>=0; i--)
           System.out.println(splitArray[i]);
    }

    public static void main(String[] args) {
        String s = "Welcome to our world";
        reverseWords(s);
    }
}
