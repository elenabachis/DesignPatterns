public interface Observable {
    public void registerObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers(String message);
}
