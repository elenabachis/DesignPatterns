public class Coffee {
    String coffetype;

    public Coffee(String coffetype, boolean hasMilk, boolean hasSugar, int price) {
        this.coffetype = coffetype;
        this.hasMilk = hasMilk;
        this.hasSugar = hasSugar;
        this.price = price;
    }

    public String getCoffetype() {
        return coffetype;
    }

    public void setCoffetype(String coffetype) {
        this.coffetype = coffetype;
    }

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

}
