import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int PaymentA = 100;
        int PaymentB = 300;
        int PaymentC = 1000;


        Scanner scanner = new Scanner(System.in);
        int PaymentHandler = scanner.nextInt();

        if (PaymentA > PaymentHandler){
            System.out.println("You can pay with A way");
        } else if (PaymentB > PaymentHandler) {
            System.out.println("You can pay with B way");
        } else if (PaymentC > PaymentHandler) {
            System.out.println("You can pay with C way");
        }

    }
}
