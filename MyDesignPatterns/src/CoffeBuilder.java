import java.util.ArrayList;

public class CoffeBuilder {

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }

    public void setHasSugar(boolean hasSugar) {
        this.hasSugar = hasSugar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    boolean hasMilk;

    boolean hasSugar;
    int price;

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    ArrayList<String> toppings;

    public CoffeBuilder(){
        this.toppings = new ArrayList<>();
    }
    public CoffeBuilder addSugar(){
        this.hasSugar=true;
        return this;
    }

    public CoffeBuilder addMilk(){
        this.hasMilk=true;
        return this;
    }

    public CoffeBuilder addCandy(){
        this.toppings.add("candy");
        return this;
    }

    public CoffeBuilder addGold(){
        this.toppings.add("gold");
        return this;
    }

}