import java.util.Scanner;

//keep entering numbers till user enters a multiple of 10
public class Break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter your number");
            int n = scan.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
