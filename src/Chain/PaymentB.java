package Chain;
public class PaymentB extends PaymentHandler {
    private double balance = 300;

    @Override
    public void handlePayment(double amount) {
        if (balance >= amount) {
            System.out.println("Payment of $" + amount + " processed by PaymentB.");
        } else if (nextHandler != null) {
            System.out.println("PaymentB cannot cover $" + amount + ", forwarding to PaymentC.");
            nextHandler.handlePayment(amount);
        } else {
            System.out.println("None of the payment methods can cover $" + amount + ".");
        }
    }
}
