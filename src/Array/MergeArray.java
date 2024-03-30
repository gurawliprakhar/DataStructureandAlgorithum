package Array;

import java.util.Scanner;

public class MergeArray {
    static int[] merged(int[]ar1, int[]ar2){
        int i=0,j=0,k=0;
        int[] res = new int[ar1.length + ar2.length];
        while(i<ar1.length && j<ar2.length){
            if(ar1[i] < ar2[j]){
                res[k] = ar1[i];
                i++;
            }else{
                res[k] = ar2[j];
                j++;
            }
            k++;
        }
        while(i<ar1.length){
            res[k] = ar1[i];
            i++;
            k++;
        }
        while(j<ar2.length){
            res[k] = ar2[j];
            j++;
            k++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();

        int[]ar1 = new int[n1];
        for(int i=0; i<n1; i++){
            ar1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[]ar2 = new int[n2];
        for(int i=0; i<n2; i++){
            ar2[i] = scan.nextInt();
        }
        int[] res = merged(ar1,ar2);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
