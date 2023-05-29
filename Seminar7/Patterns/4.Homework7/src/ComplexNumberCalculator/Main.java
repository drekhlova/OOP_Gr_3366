package ComplexNumberCalculator;

public class Main {
    public static void main(String[] args) {
        Loggable logger = new ConsoleLogger();
        iCalculableFactory factory = new CalculableFactory();
        iCalculableFactory logFactory = new LogCalculableFactory(factory, logger);
        ViewComplexCalculator viewConsole = new ViewComplexCalculator(logFactory);
        viewConsole.run();
    }
}