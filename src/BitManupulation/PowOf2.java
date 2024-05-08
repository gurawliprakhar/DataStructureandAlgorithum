package BitManupulation;

public class PowOf2 {
    static boolean powOf2(int n){
        if(n==0)return false;
        return (n&(n-1))==0;
    }

    static boolean conscutive1s(int n){
         if((n&(n<<1)) != 0) return  true;
         else return false;
    }
    
    static int countConsecutive(int n){
        int count = 0;
        while(n>0){
            n = (n&(n<<1));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 0b01100101;
        System.out.println(countConsecutive(n));
    }
}
