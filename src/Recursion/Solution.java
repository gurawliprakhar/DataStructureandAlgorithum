package Recursion;

public class Solution {
    static int findFact(int n){
        if(n==0 || n==1) return 1;
       return n*findFact(n-1);
    }

    static int fibonacci(int n){
        if(n==1 || n==2) return 1;
       return fibonacci(n-1) + fibonacci(n-2);
    }

    static void nNaturalNo(int n){
        if(n==0) return ;
        nNaturalNo(n-1);
        System.out.println(n);
    }

    static int countDigit(int n){
        if(n==0) return 0;
        return countDigit(n/10)+1;
    }

    static int sumOfDigit(int n){
        if(n==0) return 0;
         return sumOfDigit(n/10)+n%10;
    }

    static String reverseString(String s, String r, int i){
        if(i < 0 ) return r;
        return reverseString(s, r + s.charAt(i), i - 1);
    }

    static boolean isPalndrome(String s,int i, int j){
       if(s.charAt(i) != s.charAt(j)) return false;
       if(j <= i) return true;
       return isPalndrome(s,i+1,j-1);
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalndrome(s,0,s.length()-1));
    }
}
