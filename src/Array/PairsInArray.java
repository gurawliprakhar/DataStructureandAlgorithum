package Array;

public class PairsInArray {
    static void pair(int numbers[]){
        int totalPairs = 0;
       for(int i=0; i<numbers.length; i++){
           int currentNumber = numbers[i];
           for(int j=i+1; j<numbers.length; j++){
               System.out.print("(" + currentNumber +" , "+numbers[j]+")");
               totalPairs++;
           }
           System.out.println();
       }
        System.out.println("Total Pairs "+totalPairs);
    }
    static void subArray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      int[] numbers = {2,4,6,8,10};
        subArray(numbers);
    }
}
