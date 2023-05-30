package ComplexNumberCalculator;

//Класс Main
public class Main {
    public static void main(String[] args) {
        iCalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}