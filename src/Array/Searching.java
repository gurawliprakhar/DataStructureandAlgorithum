package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    static int lenearSearch(int[]ar, int k){
        for(int i=0; i<ar.length;i++){
            if(ar[i]==k)return i;
        }
        return-1;
    }
    static int binarySearch(int[]ar,  int k){
        int l=0, h=ar.length-1, mid=0;
        while(l <= h){
           mid = (l+h)/2;
           if(k == ar[mid]){return mid;}
           else if(k <ar[mid]){h=mid-1; }
           else{l=mid+1;}
        }
        return -1;
    }
    static void bubbleShort(int[]ar){
        for(int i=0; i<ar.length-1;i++){
            for(int j=0; j<ar.length-i-1; j++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
    }
    static void insertionSort(int[]ar){
        for(int i=1; i<ar.length; i++){
            int k = ar[i], j = i-1;
            while(j>=0 && ar[j]>k){
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = k;

        }
    }
    static void selectionSort(int[] ar){
        for(int i=0; i<ar.length-1; i++){
          int min_i = i;
          for(int j=i+1; j<ar.length; j++){
              if(ar[j] < ar[min_i]){min_i = j;}
          }
          int temp = ar[i];
          ar[i] = ar[min_i];
          ar[min_i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]ar = new int[n];
        for(int i=0; i< n; i++){
            ar[i] = scan.nextInt();
        }
        selectionSort(ar);
        for(int i=0; i< n; i++){
            System.out.print(ar[i] + " ");
        }
    }
}

