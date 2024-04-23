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
    static String toUpperCase(String s){
        String t = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'a' && c<='z'){
              t = t + (char)(c-32);
            }else{
                t = t + c;
            }
        }
        return t;
    }
    static int indexOf(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1; // Return -1 if the character is not found
    }
    static String trim(String s){
       String t = "";
       int si=0, ei=0;
       for(int i=0; i<s.length(); i++){
           if(s.charAt(i) != ' '){
               si = i;
               break;
           }
       }
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                ei = i;
                break;
            }
        }
        for(int i=si; i<=ei; i++){
              t += s.charAt(i);
        }
        return t;
    }
    static char[] toCharArray(String s){
        char c[] = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            c[i] = s.charAt(i);
        }
        return  c;
    }
    static int countVowel(String s){
        int count = 0;
        for(int i=0;i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' ||  c == 'A' || c == 'e' ||  c == 'E' ||
                    c == 'i' ||  c == 'I' || c == 'o' ||  c == 'O'
            || c=='u' || c=='U'){
              count++;
          }
      }
      return count;
    }
    static String reverse(String s){
      String t = "";
      for(int i=s.length()-1; i>=0; i--){
           t += s.charAt(i);
      }
      return t;
    }
    static boolean isPalindrome(String s){
      if(s.equals(reverse(s))) {
          return true;
      }
        return false;
    }
    static void printAllSubstring(String st){
        int n = st.length();
       for(int len =1; len<=n; len++ ){
           for(int s=0; s<=(n-len); s++){
               for(int e=s; e<=(s+len)-1; e++){
                   System.out.print(st.charAt(e));
               }
               System.out.println();
           }
       }
    }
   

    public static void main(String[] args) {
        String st = "parul";
        printAllSubstring(st);
        }
    }

