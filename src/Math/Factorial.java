package Math;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        int res = 1;
       for(int i=1; i<=n; i++){
            res *= i;
       }
       return res;
    }
   public static int count(int n){
        int count = 0;
        while(n > 0){
            n = n/10;
            count++;
        }
        return count;
   }

   public static int trailZeroes(int n){
     int res = 0;
     int powOf5 = 5;

     while(n >= powOf5){
         res = res  + (n/powOf5);
         powOf5 = powOf5 * 5;
     }
     return res;
   }
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(trailZeroes(n));
    }
}
