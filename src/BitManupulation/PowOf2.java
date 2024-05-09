package BitManupulation;

public class PowOf2 {
    static boolean powOf2(int n) {
        if (n == 0) return false;
        return (n & (n - 1)) == 0;
    }

    static boolean conscutive1s(int n) {
        if ((n & (n << 1)) != 0) return true;
        else return false;
    }

    static int countConsecutive(int n) {
        int count = 0;
        while (n > 0) {
            n = (n & (n << 1));
            count++;
        }
        return count;
    }

    static int swapEvenOddBits(int n) {
        return ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);
    }

    static int trailingZeroes(int n) {
        return (int) (Math.log10((n & n - 1) ^ n) / Math.log10(2));
    }

    static int reverseBinary(int n, int len) {
        int f = len - 1;
        int l = 0;
        int rev = 0;
        while (f > l) {
            if (((n & (1 << f)) != 0)) {
                rev |= (1 << l);
            }
            if (((n & (1 << l)) != 0)) {
                rev |= (1 << f);
            }
            f--;
            l++;
        }
        return rev;
    }

    static int nthPalinBin(int n) {
        int l = 0, count = 0;
        while (count < n) {
            l++;
            count = count + (int) Math.pow(2, (1 - 1) / 2);
        }
        count = count - (int) Math.pow(2, (1 - 1) / 2);
        int ele = n - count - 1;
        int ans = (1 << (l - 1)) | (ele << (1 / 2));
        ans = ans | reverseBinary(ans, l);
        return ans;
    }

    static int checkBits(int ar[], int mask){
        int count = 0;
        for (int i = 0; i < ar.length; i++)
           if((mask & ar[i]) == mask) count++;
           return count;
    }

    static int maxAndVal(int ar[]){
        int mask = 0;
        int res = 0;

        for(int i=31; i>=0; i--){
            mask = 1<<i;
            int count = checkBits(ar,mask);
            if(count >= 2) res |= mask;
        }
        return res;
    }
    public static void main(String[] args) {
        int ar[] = {16,9,6,13};
        System.out.println(maxAndVal(ar));
    }
}