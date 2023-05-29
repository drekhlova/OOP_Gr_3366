package ComplexNumberCalculator;

public class LogCalculableFactory implements iCalculableFactory {
    private CalculableFactory primaryFactory;
    private Loggable logger;

    public LogCalculableFactory(CalculableFactory primaryFactory, Loggable logger){
        this.primaryFactory = primaryFactory;
        this.logger = logger;
    }

    public LogCalculableFactory(iCalculableFactory factory, Loggable logger2) {
    }

    @Override
    public ComplexCalculable create(ComplexNumberCalculator primaryArg) {
        return new LogComplexCalculator(primaryFactory.create(primaryArg), logger);
    }
}
