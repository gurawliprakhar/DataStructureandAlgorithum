package DataType;

import java.util.Scanner;

/*
2. Triangle Game
The Westland Game Fair is the premier event of its kind for kids interested in some intellectual
and cognitive brain games. Exciting games were organized for kids between age group of 8 and
10. One such game was called the "Triangle game", where different number boards in the range 1
to 180 are available. Each kid needs to select three number boards, where the numbers on the
boards correspond to the angles of a triangle.
If the angles selected by a kid forms a triangle, he/she would receive Prize 1. If the angles
selected by a kid forms a right triangle, he/she would receive Prize 2. If the angles selected by
the kids form an equilateral triangle, he/she would receive Prize 3. If the angles selected by a kid
do not form even a triangle, then he/she will not receive any prizes. Write a program for the
organizers to fetch the result based on the number boards selected by the kids.
Input Format:
There are 3 lines in the input, each of which corresponds to the numbers on the boards that the
kids select.
Output Format:
The output should display "Prize 1" or "Prize 2" or "Prize 3" or "No Prize" based on the
conditions given.
Refer sample input and output for formatting specifications.
Sample Input 1:
60
50
70
Sample Output 1:
Prize 1
Sample Input 2:
60
60
70
Sample Output 2:
No Prize
 */
public class TriangleGame {
    public static void gameResult(int a, int b, int c){
       if((a+b+c) == 180){
         if(a == 60 && b == 60 &&  c == 60){
             System.out.println("Prize 3");
         }else if(a == 90 || b == 90 ||  c == 90){
               System.out.println("Prize 2");
         }else{
               System.out.println("Prize 1");
           }
       }else {
           System.out.println("No Prize");
       }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

       gameResult(a,b,c);
    }
}
