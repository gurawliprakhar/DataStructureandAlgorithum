package Pattern;
import java.util.Scanner;

//Practicing logical building using pattern

public class Solution {
    static void print(int n){
        for(int i=1; i<=5; i++){
           for(int j=1; j<=5; j++){
               System.out.print("* ");
           }
            System.out.println();
        }
    }

    static void printNum(int n){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    static void holloRectangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if (i==0 || i==n-1|| j==0 || j==n-1){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void printAscending(int n){
        int count = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void printAscending1(int n){
        int count = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(count<10) {
                    System.out.print("0");
                }
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
/*
  01 02 03 04 05
  02 04 06 08 10
  03 06 09 12 15
  04 08 12 16 20
  05 10 15 20 25
 */
    static void print2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<=n; j++){
                if(j*i <= 9) {
                    System.out.print("0");
                }
                System.out.print(j*i + " ");
            }
            System.out.println();
        }
    }
/*
  1 2 3 4 5
  2 3 4 5 6
  3 4 5 6 7
  4 5 6 7 8
  5 6 7 8 9
 */
   static void print3(int n){
       for(int i=0; i<n; i++){
           int count = i+1;
           for(int j=0; j<n; j++){
               System.out.print(count++ + " ");
           }
           System.out.println();
       }
    }

   static void triangle1(int n){
     for(int i=0; i<n; i++){
         for (int j=0; j<i+1; j++){
             System.out.print("* ");
         }
         System.out.println();
     }
   }
   /*1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
    */

    static void triangle2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    /*
          *
         **
        ***
       ****
      *****
     */
    static void reverseTriangle(int n){
        for(int i=0; i<n; i++){
            //k used for spaces
            for(int k=0; k<(n-1)-i ; k++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pyramid(int n){
        for(int i=0; i<n; i++){
            //k used for spaces
            for(int k=0; k<(n-1)-i ; k++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void hollowTriangle(int n){
        for(int i=0; i<n; i++){
            //k used for spaces
            for(int k=0; k<(n-1)-i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                if(j==0 || j==i || i == n-1){
                    System.out.print("* ");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void holllow1(int n){
       for(int i=0; i<n; i++){
           for(int k=0; k<(n-1)-i; k++){
               System.out.print(" ");
           }for(int j=0; j<=i; j++){
               if(j==0 || j==i || i==n-1){
                   System.out.print(j+1 + " ");
               }else{
                   System.out.print("  ");
               }
           }
           System.out.println();
       }
    }
/*
1
1 2
1   3
1     4
1 2 3 4 5
 */
    static void rightAngle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i || i==n-1){
                    System.out.print(j+1 + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

    static void rightAngle2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

    /*
    1 2 3 4 5
    2     5
    3   5
    4 5
    5
     */

    static void triangle3(int n){

    }

    public static void main(String[] args) {
        int n = 5;
        Solution sol = new Solution();
        sol.triangle3(n);
    }
}
