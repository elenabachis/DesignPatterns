public class PayByCard implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("I payed by card");
    }
}
