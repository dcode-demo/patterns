package strategy.pattern;


// AdditionStrategy.java
public class AdditionStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

// SubtractionStrategy.java
class SubtractionStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

// MultiplicationStrategy.java
class MultiplicationStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
