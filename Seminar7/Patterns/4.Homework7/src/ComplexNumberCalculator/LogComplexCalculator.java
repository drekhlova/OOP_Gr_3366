package ComplexNumberCalculator;

public class LogComplexCalculator implements ComplexCalculable {

    private ComplexCalculable calculator;
    private Loggable logger;

    public LogComplexCalculator(ComplexCalculable calculator, Loggable logger){
        this.calculator = calculator;
        this.logger = logger;
        this.logger.log(String.format("Первый аргумент = %s",this.calculator.getResult()));
    }

    @Override
    public ComplexCalculator sum(ComplexNumberCalculator secondaryArg) {
        logger.log(String.format("Суммируем с %s", secondaryArg));
        return calculator.sum(secondaryArg);
    }

     @Override
    public ComplexCalculator mul(ComplexNumberCalculator secondaryArg) {
        logger.log(String.format("Умножаем на %s", secondaryArg));
        return calculator.mul(secondaryArg);
    }

    @Override
    public ComplexCalculator div(ComplexNumberCalculator secondaryArg) {
        logger.log(String.format("Делим на %s", secondaryArg));
        return calculator.div(secondaryArg);
    }

    @Override
    public ComplexNumberCalculator getResult() {
        ComplexNumberCalculator result = calculator.getResult();
        logger.log(String.format("Получился результат %s", result));
        return result;
    }
}