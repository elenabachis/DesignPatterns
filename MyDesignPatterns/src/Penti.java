import java.util.ArrayList;

public class Penti implements Observable{

    ArrayList<Observer> observers;

    public Penti() {
        this.observers = new ArrayList<>();
    }

    public void newOffer(String offer){notifyObservers(offer);}
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer o: observers){
            o.update();
        }
    }
}
