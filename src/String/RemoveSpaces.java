package String;

import java.util.Arrays;

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
    static void nonRepSubstring(String s){
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String temp ="";
            for(int j=i; j<s.length(); j++){
                if(temp.indexOf(s.charAt(i)) == -1){
                    temp = temp + s.charAt(j);
                }else{
                    break;
                }
            }if(temp.length() > res.length()){
                res = temp;
            }
        }
        System.out.println(res);
    }
    static boolean isAnagram(String s1, String s2){
       String temp = "";
       for(int i=0; i< s1.length(); i++){
          if(s1.charAt(i) != ' '){
             temp += s1.charAt(i);
          }
       }
       s1 = temp;
       temp="";
        for(int i=0; i< s2.length(); i++){
            if(s2.charAt(i) != ' '){
                temp += s2.charAt(i);
            }
        }
       s2 = temp;
       s1 = s1.toLowerCase();
       s2 = s2.toLowerCase();
       char arr1[] = s1.toCharArray();
       char arr2[] = s2.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       s1 = new String(arr1);
       s2 = new String(arr2);

      return  s1.equals(s2);
    }
    static boolean isPanagram(String s){
        String t = "abcdefghijklmnopqrsuvwxyz";
        s = s.toLowerCase();
        int count = 0;
        for(int i=0; i<s.length(); i++){
           if(s.indexOf(t.charAt(i)) >= 0) count++;
           else break;
        }
        if(count == 26) return true;
        else return false;
    }
    static int invalidBracket(String s){
        int bracket=0, count=0;
      for(int i=0; i<s.length(); i++){
          char c = s.charAt(i);
          if(c == '(') bracket++;
          else{
              if(bracket <= 0) count ++;
              else bracket--;
          }
      }
      return count+bracket;
    }
    public static void main(String[] args) {
        String s = ")))(((())";
        System.out.println(invalidBracket(s));
       }
    }

