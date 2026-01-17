package observer.pattern;


import observer.pattern.Observer;

// Subject.java
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}