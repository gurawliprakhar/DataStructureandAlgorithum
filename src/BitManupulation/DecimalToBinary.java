package BitManupulation;

import java.util.Scanner;

public class DecimalToBinary {
    static String dToB(int n){
        String b="";
        while(n>=1) {
            int x = n % 2;
            n = n / 2;
            b = x + b;
        }
        return b;
    }

    static int b2D(String b){
       int res = 0;
       int powOf2 = 1;
       for(int i=b.length()-1; i>=0; i--){
           if(b.charAt(i) == '1') res += powOf2;
           powOf2*=2;
       }
       return res;
    }

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     String b = dToB(n);
     System.out.println(b);
        System.out.println(b2D(b));
    }
}
