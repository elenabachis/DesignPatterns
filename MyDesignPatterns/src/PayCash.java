public class PayCash implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("I payed cash");
    }
}
