package observer.pattern;

import observer.pattern.Observer;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        ConcreteSubject subject = new ConcreteSubject();

        Observer obs1 = new ConcreteObserverA("Observer1");
        Observer obs2 = new ConcreteObserverB("Observer2");

        subject.registerObserver(obs1);
        subject.registerObserver(obs2);

        subject.setState("Hello observers!");
        Thread.sleep(200);

        subject.removeObserver(obs1);
        subject.setState("Second update — only Observer2 should see this.");
    }
}
