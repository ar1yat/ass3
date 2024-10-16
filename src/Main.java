import Chain.PaymentA;
import Chain.PaymentB;
import Chain.PaymentC;
import Chain.PaymentHandler;

public class Main {
    public static void main(String[] args) {
        // Создаем обработчики
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        // Устанавливаем цепочку
        paymentA.setNextHandler(paymentB);
        paymentB.setNextHandler(paymentC);

        // Попытка покупки на сумму 210 долларов
        double purchaseAmount = 210;
        paymentA.handlePayment(purchaseAmount);
    }
}
