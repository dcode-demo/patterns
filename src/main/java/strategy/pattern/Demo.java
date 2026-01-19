package strategy.pattern;


// Demo.java
public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new AdditionStrategy());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new SubtractionStrategy());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new MultiplicationStrategy());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
