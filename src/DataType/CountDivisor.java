package DataType;

import java.util.Scanner;

/*
You have been given 3 integers - l, r, and k. Find how many numbers between l and r (both
inclusive) are divisible by k. You do not need to print these numbers, you just have to find their
count.
Input Format
The first and only line of input contains 3 space-separated integers l, r, and k.
Output Format
Print the required answer on a single line.
Sample Input:
1 10 1
Sample Output:
10
 */
public class CountDivisor {
    public static int countDivisor(int l, int r, int k){
        int count = 0;
        for(int i = l; i <= r; i++){
            if(i % k == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(countDivisor(l, r, k));

    }
}