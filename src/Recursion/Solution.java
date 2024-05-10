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
    public static void main(String[] args) {
        System.out.print(fibonacci(6));
    }
}
