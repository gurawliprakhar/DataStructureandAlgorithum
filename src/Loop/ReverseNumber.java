package Loop;

public class ReverseNumber {
    static void reverse(int n){
        while(n>0){
            int  lastDigit= n%10;
            System.out.print(lastDigit);
            n= n/10;
        }
        System.out.println();
    }
    static void reverse1(int n){
      int rev = 0;
      while(n>0){
          int lastDigit = n%10;
          rev=(rev*10)+lastDigit;
          n=n/10;
      }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        int n = 25012002;
        reverse1(n);
    }
}
