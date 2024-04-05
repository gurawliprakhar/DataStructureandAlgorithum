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
   //brute force
   static int findGcd(int n1, int n2){
        int min = 0;
        if(n1 < n2){
            min = n1;
        }else{
            min = n2;
        }
        for(int i=min; i>=1; i--){
          if(n1%i==0 && n2%i==0){
              return i;
          }
       }
        return 1;
   }
   static int euclidGcd(int n1, int n2){
       while(n1 != n2){
           if(n1 > n2 ){
               n1 = n1-n2;
           }else{
               n2 = n2-n1;
           }
       }
       return n1;
   }
   //gabrial lame
    static int lameGcd(int n1, int n2){
        while (n1!=0 && n2!=0){
            if(n1 > n2){
                n1 = n1%n2;
            }else {
                n2 = n2%n1;
            }
        }
        if(n1!=0) {
            return n1;
        }else{
            return n2;
        }
    }
    static int lcm(int n1, int n2){
         int res = Math.max(n1,n2);
         while(true){
             if(res%n1==0 && res%n2==0){
                 break;
             }
             res++;
         }
     return res;
    }
    static int euclidsLcm(int n1, int n2){
       return (n1*n2)/euclidGcd(n1,n2);
    }
    static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++ ){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean checkPrime(int n){
      if(n==1) return false;
      if(n==2 || n==3) return true;
      if(n%2==0 || n%3==0) return false;
      for(int i=5; i<Math.sqrt(n);i++){ //Math.sqrt can be replaced by i*i<=n;i=i+6
          if(n%i==0 || n%(i+2)==0) return false;
      }
      return true;
    }
    static void  divisior(int n){
       for(int i=1; i*i<=n; i++){
           if(n%i == 0){
               System.out.println(i);
               if(i != n/i){System.out.println(n/i);
               }
           }
        }
    }
    static void primeFactors(int n) {
        int i = 2;
        while (n > 1) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
            i++;
        }
    }
    public static int binomialCoefficient(int n,int r){
      int fact_n = fact(n);
      int fact_r = fact(r);
      int fact_nmr = fact(n-r);

      int binomialCoefficient = fact_n / (fact_r * fact_nmr);
      return binomialCoefficient;
     }
     //convert binary to decimal
    static void BinToDec(int n){
        int mynum=n,pow=0, dec=0;
        while(n != 0){
            int lastDigit = n%10;
            dec =  dec+(lastDigit * (int) Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("decimal of "+mynum + " =" + dec);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BinToDec(n);
    }
}
