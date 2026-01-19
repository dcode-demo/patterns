package strategy.pattern;


// Context.java
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.execute(a, b);
    }
}
