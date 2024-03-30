//https://www.hackerrank.com/challenges/the-hurdle-race/problem
package Array;
import java.util.Scanner;

public class HurdleRaceProblem {
    static int hurdleRace(int k, int[] height){
       int max = 0;
       for(int i=0; i<height.length; i++){
           if(height[i] > max){
               max = height[i];
           }
       }
       if(max <= k) {
           return 0;
        }else{
           return max-k;
       }
    }
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int size = scan.nextInt();
       int k = scan.nextInt();
       int[] height = new int[size];

       for(int i=0; i<size; i++){
           height[i] = scan.nextInt();
       }
       int res = hurdleRace(k,height);
        System.out.println(res);
    }
}
