package Array;
//https://leetcode.com/problems/maximum-subarray/submissions/1227548169/
public class maxSubArraySum {
    static void maxSubArray(int numbers[]){
       int currentSum = 0;
       int maximumSum = Integer.MIN_VALUE;
       for(int i=0; i<numbers.length; i++){
           int start = i;
           for(int j=i; j<numbers.length; j++){
               int end = j;
               currentSum= 0;
               for(int k=start; k<=end; k++){
                   //subArray sum
                   currentSum += numbers[k];
               }
               System.out.println();
               if(maximumSum < currentSum){
                   maximumSum = currentSum;
               }
           }
       }
        System.out.println("maxSum= "+maximumSum);
    }
    static void prefixSum(int[] numbers){
       int currentSum = 0;
       int maximumSum = Integer.MIN_VALUE;
       int prefix[] = new int[numbers.length];

       prefix[0] = numbers[0];
       //calculate prefix array
       for(int i=1; i<prefix.length; i++) {
           prefix[i] = prefix[i-1] + numbers[i];
       }
       for(int i=0; i<numbers.length; i++){
           int start = i;
           for(int j=i; j<numbers.length; j++){
               int end = j;
               currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
               System.out.println();
               if(maximumSum < currentSum){
                   maximumSum = currentSum;
               }
           }
       }
       System.out.println("maxSum= "+maximumSum);
    }
    static void kadanesAlgorithum(int numbers[]){
       int maximumSum = Integer.MIN_VALUE,  currentSum = 0;

       for(int i=0; i<numbers.length; i++){
           currentSum += numbers[i];
           if(currentSum < 0){
               currentSum = 0;
           }
           maximumSum = Math.max(currentSum,maximumSum);
       }
        System.out.println("our max subArray sum is : " + maximumSum);
    }

    //handle negetive values
    static void kadanes(int numbers[]){
        int maximumSum = numbers[0];
        int currentSum = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            maximumSum = Math.max(currentSum, maximumSum);
        }
        System.out.println(maximumSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2,1,-3,4,-1,2,1,-5,4};
        kadanesAlgorithum(numbers);
    }
}
