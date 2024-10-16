package Chain;
// Абстрактный обработчик
public abstract class PaymentHandler {
    protected PaymentHandler nextHandler; // Следующий обработчик в цепочке

    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Метод для обработки платежа
    public abstract void handlePayment(double amount);
}
