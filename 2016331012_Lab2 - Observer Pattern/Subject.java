/**
 * Subject
 */
public interface Subject {

    public void addObserver(Observer obj);

    public void removeObserver(Observer obj);

    public void notifyObservers(Observer obj);
    
}