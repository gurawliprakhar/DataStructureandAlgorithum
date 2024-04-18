package String;

public class RemoveSpaces  {
    static int countSpaces(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') count++;
        }
        return count;
    }
 //count the no of given charecter in string
    static int countCharInString(String s, String c){
       //always declare varibale name in small..
        char key = c.charAt(0);
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == key) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "How are you";
        String c = "o";
        System.out.println(countCharInString(s,c));
    }
}
