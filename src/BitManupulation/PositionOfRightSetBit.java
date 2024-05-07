package BitManupulation;


public class PositionOfRightSetBit {
   static int posOfRMSB(int n){
     return (int)(Math.log10(n^(n&(n-1))) / Math.log10(2));
   }

   static int countSetBit(int n){
       int count = 0;
       while(n > 0) {
           n = n & (n - 1);
           count++;
       }
       return count;
   }
    public static void main(String[] args) {
        int n = 42;
        System.out.println(countSetBit(n));
    }
}
