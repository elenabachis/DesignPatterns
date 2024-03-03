public class CoffeeShop {

    public Coffee prepareMenu(String menutype){
        if(menutype.equals("Buna Dimi")){
            return new Coffee("Black", false, true, 5);
        }
        if(menutype.equals("Night")){
            return new Coffee("Matcha", true, true, 10);
        }
        return  null;
    }

}
