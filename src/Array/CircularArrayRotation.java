package Array;
//https://www.hackerrank.com/challenges/circular-array-rotation/problem?isFullScreen=false
import java.util.Scanner;
public class CircularArrayRotation {
    static int[] circularArrayRotation(int[] a, int k, int[] q) {
        int[] res = new int[q.length];
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(i + k) % a.length] = a[i];
        }
        for (int i = 0; i < q.length; i++) {
            res[i] = b[q[i]];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }
        int q = scan.nextInt();
        int[] queries = new int[q]; // Create an array for queries
        for (int i = 0; i < q; i++) {
            queries[i] = scan.nextInt();
        }
        int[] result = circularArrayRotation(ar, k, queries); // Call the method with queries array
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]); // Print each element of the result array
        }
    }
}
