package Pattern;
import java.util.Scanner;

//Practicing logical building using pattern

public class Solution {
   /*
    *****
    *****
    *****
    *****
    */
    static void print(int n){
        for(int i=1; i<=5; i++){
           for(int j=1; j<=5; j++){
               System.out.print("* ");
           }
            System.out.println();
        }
    }
/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
 */
    static void printNum(int n){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
/*
 * * * * *
 *       *
 *       *
 *       *
 * * * * *
 */
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

    /*
    01 02 03 04 05
    06 07 08 09 10
    11 12 13 14 15
    16 17 18 19 20
    21 22 23 24 25
     */
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
/*
     *
    * *
   * * *
  * * * *
 * * * * *
 */
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
/*
     *
   *  *
  *    *
 *       *
 * * * * *
 */
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
      for(int i=1; i<=n; i++){
          int count = i;
          for(int j=1; j<=(n-1)+1; j++){
              if(i==1 || j==1 || j==(n-1)+1){
                  System.out.print(count++ + " ");
              }else{
                  System.out.println("  ");
              }
          }
      }
    }
/*
*
* *
* * * * *
*  * * * * * *
* * * * * * * * *
 */
    static void triangle4(int n){
      for(int i=1; i<=n; i++){
          for(int j=1; j<=(2*i)-1; j++){
              System.out.print("* ");
          }
          System.out.println();
        }
    }
   /*        *
         * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *

    */
    static void triangle5(int n) {
      for(int i=1; i<=n; i++){
          for (int k=1; k<=(n-i); k++){
              System.out.print(" ");
          }
          for(int j=1; j<=(2*i)-1; j++){
              System.out.print("* ");
          }
          System.out.println();
      }
    }
   /*
   1
   1 2 1
   1 2 3 2 1
   1 2 3 4 3 2 1
   1 2 3 4 5 4 3 2 1
    */
    static void Pattern1(int n){
        for(int i=1;i<=n; i++){
            int count = 1;
            for(int j=1; j<=(2*i)-1; j++){
                if (j < i) {
                    System.out.print(count++ + " ");
                }else{
                    System.out.print(count-- + " ");
                }
            }
            System.out.println();
        }

   }
   /*
   1 1 1 1 1 2
   3 2 2 2 2 2
   3 3 3 3 3 4
   5 4 4 4 4 4
   5 5 5 5 5 6
    */
     static void Pattern2(int n){
         for(int i=1; i<=n; i++) {
             if(i%2 == 0){
                 System.out.print(i+1 + " ");
             }
             for (int j = 1; j <= n; j++) {
                 System.out.print(i + " ");
             }
             if (i % 2 != 0) {
                 System.out.print(i+1 + " ");
             }
             System.out.println();
         }
   }
   /*
   1
   2 2
   3 3 3
   4 4 4 4
   5 5 5 5 5
   6 6 6 6
   7 7 7
   8 8
   9
    */
   static void Pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(n-i);
            }
            System.out.println();
        }
     }
   /*
   1
   2 3
   4 5 6
   7 8 9 10
   11 12 13 14 15
    */
   static void Pattern4(int n){
       int count = 1;
      for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){
              System.out.print(count++ + " ");
              System.out.print("*");
          }
          System.out.println();
      }
   }

  /*
  1
  3*2
  6*5*4
  10*9*8*7
  15*14*13*12*11
   */
  static void Pattern5(int n){
      for(int i=1; i<=n; i++){
          int count = i*(i+1)/2;
          for(int j=1; j<=i; j++){
              System.out.print(count--);
              if(j <= i-1) {
                  System.out.print("*");
              }
          }
          System.out.println();
      }
   }

  /*
  A
  B B
  C C C
  D D D D
  E E E E E
   */
   public static void alphabeticPattern1(int n){
       char ch = 'A';
     for(int i=1; i<=n; i++){
         for(int j=1; j<=i; j++){
             System.out.print(ch);
         }
         ch++;
         System.out.println();
     }
  }
 /*
 A
 A B
 A B C
 A B C D
 A B C D E
  */
  public static void alphabeticPattern2(int n){
      for(int i=1; i<=n; i++){
          char ch = 'A';
          for(int j=1; j<=i; j++){
              System.out.print(ch++);
          }
          System.out.println();
      }
 }
 /*
 A
 C  B
 D E F
 J I H G
 K L M N O
  */
 public static void alphabeticPattern3(int n) {
     char ch = 'A';
     for (int i = 0; i <= n; i++) {
         if (i % 2 == 0) {
             char charRev = (char) (ch + i - 1);
             for (int j = 1; j <= i; j++) {
                 System.out.print(charRev-- + " ");
                 ch++;
             }
         } else {
             for (int j = 1; j <= i; j++) {
                 System.out.print(ch++ + " ");
             }
         }
         System.out.println();
     }
 }
     public static void main(String[] args) {
        int n = 5;
        Solution sol = new Solution();
        sol.alphabeticPattern3(n);
    }
}
