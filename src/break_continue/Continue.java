package break_continue;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      do{
          System.out.println("Enter the number: ");
          int n = scan.nextInt();

          if(n%10 == 0){
              continue;
          }
          System.out.println("Number was: "+n);
      }while (true);
    }
}
