// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Factory
       CoffeeShop coffeeShop= new CoffeeShop();
       Coffee coffee= coffeeShop.prepareMenu("Buna Dimi");
       String coffetype="Black";
       assert(coffetype==coffee.getCoffetype());

        //Builder
        CoffeBuilder coffeBuilder= new CoffeBuilder().addMilk().addCandy();
        assert coffeBuilder.getToppings().contains("candy");

        //Strategy
        PaymentStrategy payByCard= new PayByCard();
        Customer customer= new Customer();
        customer.setPaymentStrategy(payByCard);
        customer.pay();

        //Observer
        Penti penti= new Penti();
        Viewer viewer=new Viewer();
        penti.newOffer("50%");
        viewer.update(); //update

        //Singleton
        FamilyMember familyMember1= new FamilyMember("Elena", "20");
        FamilyMember familyMember2= new FamilyMember("Elena", "20");
        FamilyMember familyMember3= new FamilyMember("Elena", "21");
        assert familyMember1==familyMember2;
        assert familyMember3!=familyMember2;

        //Adapter
        Teacher teacher= new TeacherImpl();
        Tutor tutor= new TutorImpl(teacher);
        tutor.teachesLikeTeacher();

        //Proxy
        User actualuser=new ActualUser();
        User hacker= new Hacker(actualuser,true);
        User actual= new Hacker(actualuser,false);

        assert hacker.logIn().equals("Unauthorized access");
        assert actual.logIn().equals("Logged in");

    }
}