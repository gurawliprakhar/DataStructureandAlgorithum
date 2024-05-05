package Interview;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    static String removeDuplicate(String s){
        Set<Character> set = new HashSet<>();
        StringBuffer sf = new StringBuffer();
        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(!set.contains(c)) {
                set.add(c);
                sf.append(c);
            }
        }
        return sf.toString();
    }
    public static void main(String[] args) {
        String s = "paaji";
        System.out.println(removeDuplicate(s));
    }
}
