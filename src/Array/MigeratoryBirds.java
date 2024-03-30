package Array;
//https://www.hackerrank.com/challenges/migratory-birds/problem
import java.util.Scanner;

public class MigeratoryBirds {
    static int birds(int[]ar){
      int[] birds = new int[ar.length];
      for(int i=0; i<ar.length; i++){
          birds[ar[i]]++;
      }
      int maxIndex=0,max=-1;
      for(int i=0; i<birds.length; i++){
          if(birds[i]>max){
              max=birds[i];
              maxIndex = i;
          }
      }
      return maxIndex;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = scan.nextInt();
        }
        System.out.println(birds(ar));
    }
}
