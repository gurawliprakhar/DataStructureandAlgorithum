package Array;

import java.util.Scanner;

public class WalkInRow {
    static int walkWidth(int[]ar, int k){
        int width = 0;
        for(int i=0; i<ar.length; i++){
            if(ar[i] <= k){width += 1;}
            else{width += 2;}
        }
        return width;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = scan.nextInt();
        }
        System.out.println(walkWidth(ar,k));
    }
}
