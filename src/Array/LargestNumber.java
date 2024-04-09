package Array;
import java.util.*;
public class LargestNumber {
    static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;//-infinity value
        int smallest = Integer.MAX_VALUE;//-infinity value
        for(int i = 0; i< numbers.length; i++){
            if(largest <numbers[i]){
                largest = numbers[i];
            }
            if(smallest >numbers[i]){
                smallest = numbers[i];

            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] ar = {1,2,6,3,5};
        System.out.println("smallest value is : " + getlargest(ar));

    }
}
