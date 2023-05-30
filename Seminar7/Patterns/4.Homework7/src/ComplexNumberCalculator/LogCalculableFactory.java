package ComplexNumberCalculator;

// Класс LogCalculableFactory, содержащий логгеры
public class LogCalculableFactory implements iCalculableFactory {
    private iLoggable logger;

    public LogCalculableFactory(iLoggable logger) {
        this.logger = logger;
    }

    @Override
    public iCalculable create(ComplexNumber primaryArg) {
        return new LogCalculator(new ComplexCalculator(primaryArg), logger);
    }
}