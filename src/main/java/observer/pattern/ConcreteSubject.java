package observer.pattern;// ConcreteSubject.java
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Concrete Subject (observable). Uses CopyOnWriteArrayList for simple thread-safety.
 */
public class ConcreteSubject implements Subject {
    private final List<Observer> observers = new CopyOnWriteArrayList<>();
    private String state; // example state

    public void setState(String newState) {
        this.state = newState;
        notifyObservers();
    }

    public String getState() {
        return state;
    }

    @Override
    public void registerObserver(Observer o) {
        if (o != null && !observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(state);
        }
    }
}
