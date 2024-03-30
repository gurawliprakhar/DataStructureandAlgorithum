package Array;

import java.util.Scanner;

public class AesNumber {
    static boolean isAes(int n){
       int count = 0;
       for(int i=1; i<=n; i++){
           if(n%i==0) count++;
       }
       if(count==4){return true;}
       else{return false; }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int aes = 0;

        for(int i=l; i<=r; i++){
            if(!isAes(i))aes++;
        }
        System.out.println(aes);

    }
}
