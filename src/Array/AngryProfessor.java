package Array;
//https://www.hackerrank.com/challenges/angry-professor/problem
import java.util.Scanner;
public class AngryProfessor {
    static String angProf(int k, int[]ar){
       int count = 0;
       for (int i=0; i<ar.length; i++){
           if(ar[i] <= 0){
               count++;
           }
       }
       if(count >= k){
           return "NO";
       }else{
           return "YES";
       }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[]ar = new int[n];
        for (int i=0; i<n;i++){
            ar[i] = scan.nextInt();
        }
        System.out.println(angProf(k,ar));
    }
}
