public class Customer {

    public Customer() {
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    private PaymentStrategy paymentStrategy;

    public void pay(){paymentStrategy.pay();}
}
