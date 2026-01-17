package observer.pattern;

import observer.pattern.Observer;

// ConcreteObserverB.java
public class ConcreteObserverB implements Observer {
    private final String name;

    public ConcreteObserverB(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " (B) got message length: " + (message == null ? 0 : message.length()));
    }
}
