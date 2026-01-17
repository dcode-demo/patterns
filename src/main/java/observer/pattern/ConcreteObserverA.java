package observer.pattern;

import observer.pattern.Observer;

// ConcreteObserverA.java
public class ConcreteObserverA implements Observer {
    private final String name;

    public ConcreteObserverA(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " (A) received update: " + message);
    }
}
