package Chain;
public class PaymentC extends PaymentHandler {
    private double balance = 1000;

    @Override
    public void handlePayment(double amount) {
        if (balance >= amount) {
            System.out.println("Payment of $" + amount + " processed by PaymentC.");
        } else {
            System.out.println("None of the payment methods can cover $" + amount + ".");
        }
    }
}
