package Array;
import java.util.Arrays;//time complexity onlogn
public class basicSorting {
    static void bubbleSort(int array[]){
        for(int turns=0; turns<array.length; turns++){
            for(int j=0; j< array.length-1-turns; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }//o(n)2
    }
    static void printArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    static void selectionSort(int array[]){
        for(int i=0; i<array.length-1; i++){
            int minPosition = i;
            for(int j=i+1; j< array.length; j++){
                if(array[minPosition] > array[j]){
                   minPosition = j;
                }
            }
            //swap
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }
    }
    static void insertionSort(int array[]){
        for(int i=1; i< array.length; i++){
            int current = array[i];
            int previous = i-1;
            //finding out the currect position to insert
            while(previous >= 0 && array[previous] > current){
              array[previous+1] = array[previous];
              previous--;
            }
            //insertion
           array[previous+1] = current;
        }
    }//time complexity O(n)2
    static void countingSort(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            largest = Math.max(largest,array[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<array.length; i++){
            count[array[i]]++ ;
        }
        //sorting
        int j=0;
        for(int i=0; i< count.length; i++){
            while(count[i]>0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        countingSort(array);
        printArray(array);
    }
}
