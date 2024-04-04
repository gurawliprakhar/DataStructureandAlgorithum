package DataType;

import jdk.dynalink.Operation;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("print number1: ");
        int number1 = scan.nextInt();
        System.out.println("print number2: ");
        int number2 = scan.nextInt();
        System.out.println("Enter operator: ");
        char operator = scan.next().charAt(0);

        switch (operator){
            case '+' : System.out.println(number1 + number2);
                    break;
            case '-' : System.out.println(number1 - number2);
                break;
            case '*' : System.out.println(number1 * number2);
                break;
            case '/' : System.out.println(number1 / number2);
                break;
            case '%' : System.out.println(number1 % number2);
                break;
            default :
                System.out.println("wrong operator");
        }
    }
}
